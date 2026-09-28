package bitmanipulation;

public class NumberOfTrailingZeros {

  static void main() {

    int n = 6;

    // 6 in binary = 0110
    //
    // Trailing zeros are the 0s after the rightmost 1.
    //
    // 0110
    //   ↑
    // There is 1 trailing zero.


    // n & (n - 1) removes the rightmost set bit.
    //
    //   0110
    // & 0101
    // -------
    //   0100
    //
    // XOR with original n isolates the removed bit:
    //
    //   0110
    // ^ 0100
    // -------
    //   0010
    //
    // result = 2 = 2^1
    // The exponent 1 is the number of trailing zeros.
    int result = (n & (n - 1)) ^ n;


    // log2(result) gives the position/index of the isolated bit.
    //
    // result = 2
    // log2(2) = 1
    //
    // Therefore, n has 1 trailing zero.
    int numberOfZeros = (int) (Math.log(result) / Math.log(2));

    System.out.println("Trailing zeros: " + numberOfZeros);
  }
}
