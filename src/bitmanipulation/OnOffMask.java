package bitmanipulation;

public class OnOffMask {

  static void main() {
    offMask();
    onMask();
    toggleMask();
  }

  private static void toggleMask() {
    int n= 8; // make second bit from right 1

    // Toggle the second bit from the right (bit position 1).
    //
    // 8 in binary = 1000
    // Bit position: 3210
    //
    // Create a mask for bit position 1:
    // 1 << 1 = 0010
    //
    // XOR (^) is used to TOGGLE a bit:
    //   0 ^ 1 = 1  -> turns the bit ON
    //   1 ^ 1 = 0  -> turns the bit OFF
    //
    // Therefore:
    //   1000  (8)
    //   0010  (mask)
    //   ----
    //   1010  (10)
    //
    // So the second bit from the right changes from 0 -> 1.
    int toggleMask  = 1<<1;
    int result = n^toggleMask;
    System.out.println("Toggle Mask result: "+result);

  }

  private static void onMask() {
    int n = 5;
    // Set the second bit from the right (bit position 1) to 1.
    //
    // 5 in binary  = 0101
    // Bit position:  3210
    //
    // We want to turn bit position 1 ON.
    // 1 << 1 = 0010  -> creates a mask with only bit 1 set.
    //
    // OR (|) is used to SET a bit to 1.
    // 0101  (5)
    // 0010  (mask)
    // ----
    // 0111  (7)
    int positionToShift = 1;
    int onMask = (1 << positionToShift);

    int result = n | onMask;

    System.out.println("On mask result: " + result);
  }

  private static void offMask() {
    int n = 5;
    // Set the first bit from the right (bit position 0) to 0.
    //
    // 5 in binary  = 0101
    // Bit position:  3210
    //
    // First create a mask:
    // 1 << 0 = 0001
    //
    // Then invert it using ~:
    // ~(0001) = 1110
    //
    // AND (&) is used to CLEAR/SET a bit to 0.
    //
    // 0101  (5)
    // 1110  (mask)
    // ----
    // 0100  (4)
    int positionToShift = 0;
    int offMask = ~(1 << positionToShift);

    int result = n & offMask;

    System.out.println("Off mask result: " + result);
  }
}
