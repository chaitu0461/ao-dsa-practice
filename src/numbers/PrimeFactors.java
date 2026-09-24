package numbers;

public class PrimeFactors {
  static void main() {

    int number = 95;
    // Try every possible factor starting from 2.
    // First factor is <=sqrt(n)
    for (int factor = 2; factor * factor <= number; factor++) {

      // Keep dividing while factor divides number.
      //
      // We use a while loop because the same prime factor
      // can occur multiple times.
      //
      // Example:
      // 60 -> 30 -> 15
      // So 2 is found twice.
      while (number % factor == 0) {

        System.out.println(factor);

        // Remove this factor from the number.
        number = number / factor;
      }
    }

    // If something greater than 1 remains,
    // it must itself be a prime factor.
    if (number > 1) {
      System.out.println(number);
    }
  }
}
