package bitmanipulation;

public class ReversingBitsOfInteger {

  static void main() {

    int n = 4;
    int left = 31;
    int right = 0;
    int result = 0;

    while (right <= left) {

      // Extract the left and right bits.
      int leftBit = n & (1 << left);
      int rightBit = n & (1 << right);

      // If left bit is 1, set right bit in result.
      if (leftBit != 0) {
        result = result | (1 << right);
      }

      // If right bit is 1, set left bit in result.
      if (rightBit != 0) {
        result = result | (1 << left);
      }

      // Move towards the center.
      left--;
      right++;
    }

    System.out.println("Reversed bit number: " + result);
  }
}
