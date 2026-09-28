package bitmanipulation;

public class DivideTwoNumbersWithoutMultiplicationAndDivision {

  static void main() {

    int quotient = divide(100, 7);
    System.out.println("Quotient: " + quotient);
  }

  private static int divide(int dividend, int divisor) {

    // If both numbers are equal, quotient is always 1.
    if (dividend == divisor)
      return 1;

    // Dividing by 1 gives the same number.
    if (divisor == 1)
      return dividend;

    // Special overflow case:
    //
    // Integer.MIN_VALUE = -2147483648
    //
    // -2147483648 / -1 = 2147483648
    //
    // But 2147483648 cannot fit inside an int.
    // Maximum int = 2147483647
    if (dividend == Integer.MIN_VALUE && divisor == -1)
      return Integer.MAX_VALUE;


    // Assume result is positive.
    // If dividend and divisor have different signs,
    // result should be negative.
    boolean isPositive = true;

    if (dividend >= 0 && divisor < 0)
      isPositive = false;
    else if (dividend < 0 && divisor > 0)
      isPositive = false;


    // Convert both numbers to positive values.
    //
    // We use long because:
    //
    // Integer.MIN_VALUE = -2147483648
    //
    // But +2147483648 cannot be stored in an int.
    //
    // Math.abs(Integer.MIN_VALUE) would still be negative
    // if we did it directly on an int.
    //
    // So first convert to long:
    //
    // (long) dividend
    //
    // and THEN take Math.abs().
    long absDividend = Math.abs((long) dividend);
    long absDivisor = Math.abs((long) divisor);


    int ans = 0;


    // Keep subtracting divisor while dividend is large enough.
    //
    // Instead of subtracting divisor one time at a time,
    // we subtract divisor * powers of 2.
    //
    // Example:
    //
    // 100 / 7
    //
    // 7 × 1  = 7
    // 7 × 2  = 14
    // 7 × 4  = 28
    // 7 × 8  = 56  ← largest possible
    //
    // So we can subtract 56 in one step
    // instead of subtracting 7 eight times.
    while (absDividend >= absDivisor) {

      int count = 0;


      // Find the largest power of 2 that can be
      // multiplied with the divisor without exceeding
      // the current dividend.
      //
      // IMPORTANT: count + 1
      //
      // count represents the power we have already accepted.
      // count + 1 checks the NEXT power.
      //
      // Example:
      //
      // absDividend = 100
      // absDivisor  = 7
      //
      // count = 0:
      // 7 << 1 = 14  → can take it
      //
      // count = 1:
      // 7 << 2 = 28  → can take it
      //
      // count = 2:
      // 7 << 3 = 56  → can take it
      //
      // count = 3:
      // 7 << 4 = 112 → too large
      //
      // Therefore count remains 3.
      //
      // We use count + 1 because we are asking:
      // "Can I go ONE step further?"
      while (absDividend >= (absDivisor << (count + 1))) {
        count++;
      }


      // Subtract the largest possible chunk.
      //
      // If count = 3:
      //
      // absDivisor << 3
      // = 7 × 2³
      // = 7 × 8
      // = 56
      //
      // 100 - 56 = 44
      absDividend = absDividend - (absDivisor << count);


      // Add the corresponding power of 2 to the quotient.
      //
      // count = 3
      //
      // 1 << 3 = 8
      //
      // Because we subtracted 7 × 8,
      // we add 8 to the quotient.
      ans = ans + (1 << count);
    }


    // If the positive result is 2147483648,
    // it cannot fit inside an int.
    if (isPositive && ans == (1 << 31))
      return Integer.MAX_VALUE;

    // If the negative result is -2147483648,
    // this value CAN fit inside an int.
    if (!isPositive && ans == (1 << 31))
      return Integer.MIN_VALUE;


    // Apply the original sign to the quotient.
    return isPositive ? ans : -1 * ans;
  }
}
