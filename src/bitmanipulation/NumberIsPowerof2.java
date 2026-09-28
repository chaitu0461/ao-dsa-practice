package bitmanipulation;

public class NumberIsPowerof2 {

  static void main() {

    int n = 7;

    // A power of 2 has exactly ONE set bit.
    //
    // Examples:
    // 1  = 0001
    // 2  = 0010
    // 4  = 0100
    // 8  = 1000
    //
    // n & (n - 1) removes the rightmost set bit.
    //
    // If n has only ONE set bit, removing it makes n = 0.
    //
    // Example: n = 8
    // 1000 & 0111 = 0000  → power of 2
    //
    // Example: n = 7
    // 0111 & 0110 = 0110  → not a power of 2

    int result = n & (n - 1);

    System.out.println(result == 0);
  }
}
