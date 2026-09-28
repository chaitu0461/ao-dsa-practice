package bitmanipulation;

public class MinBitFlipsToConvertNumber {

  static void main() {

    int number = 10; // Binary: 1010
    int goal = 7;    // Binary: 0111

    // XOR tells us which bits are different.
    //
    // Same bits  -> 0
    // Different  -> 1
    //
    //   1010  (10)
    // ^ 0111  (7)
    // -------
    //   1101
    //
    // 1s in the result = bits that need to be flipped.
    int result = number ^ goal;

    int count = 0;

    // An int has 32 bits.
    // Check each bit to count how many bits are 1.
    for (int i = 0; i < 32; i++) {

      // Create a mask with only bit i set.
      //
      // i = 0 → 0001
      // i = 1 → 0010
      // i = 2 → 0100
      // ...
      int mask = 1 << i;

      // If the corresponding bit in result is 1,
      // that bit is different between number and goal,
      // so it needs to be flipped.
      if ((mask & result) != 0) {
        count++;
      }
    }

    System.out.println("Min bit flips: " + count);
  }
}
