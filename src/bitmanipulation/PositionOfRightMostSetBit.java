package bitmanipulation;

public class PositionOfRightMostSetBit {

  static void main() {

    int n = 33;

    // 33 = 100001
    // Rightmost set bit is the last 1.

    // n - 1:
    // The rightmost 1 becomes 0,
    // and all 0s to its right become 1.
    //
    // 100001  (33)
    // 100000  (32)
    int mask = n & (n - 1);

    // n & (n - 1) removes the rightmost set bit.
    //
    // 100001
    // 100000
    // ------
    // 100000

    // XOR with original n to isolate the removed bit.
    //
    // 100001
    // 100000
    // ------
    // 000001
    //
    // XOR gives 1 where the bits are different.
    int result = mask ^ n;

    // result is a power of 2.
    // log2(result) gives the bit index (starting from 0).
    // +1 converts it to position starting from 1.
    int position = (int) (Math.log(result) / Math.log(2)) + 1;

    System.out.println("Position is: " + position);
  }
}
