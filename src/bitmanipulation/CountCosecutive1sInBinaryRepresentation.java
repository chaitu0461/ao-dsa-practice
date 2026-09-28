package bitmanipulation;

public class CountCosecutive1sInBinaryRepresentation {

  static void main() {

    int n = 3;
    int count = 0;

    // 3 in binary = 0011
    //
    // n & (n << 1) helps find consecutive 1s.
    //
    // Left shift moves the bits one position to the left:
    //
    // n       = 0011
    // n << 1  = 0110
    //
    // AND:
    //
    //   0011
    // & 0110
    // ------
    //   0010
    //
    // One 1 is removed from each consecutive group.

    while (n > 0) {

      // Shift left by 1 and AND with original n.
      // This keeps 1s that have another 1 immediately to their left.
      n = n & (n << 1);

      // Each iteration represents one level of consecutive 1s.
      count++;
    }

    System.out.println("Consecutive 1s: " + count);
  }
}
