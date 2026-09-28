package bitmanipulation;

public class CountSetBits {

  static void main() {

    int n = 8;
    int count = 0;

    // n & (n - 1) removes the rightmost set bit (1).
    // Repeat until n becomes 0.
    //
    // 8 = 1000
    //
    // 1000 & 0111 = 0000
    //
    // One set bit was removed, so count = 1.

    while (n > 0) {

      // Remove the rightmost set bit.
      n = n & (n - 1);

      // Each iteration removes exactly one set bit.
      count++;
    }

    System.out.println("Set bits count: " + count);
  }
}
