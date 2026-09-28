package bitmanipulation;

public class NonRepeatingInteger {

  static void main() {

    int[] nums = {1, 4, 5, 1, 5, 3, 4, 7, 7};

    int result = 0;

    // XOR properties:
    //
    // n ^ n = 0       → same numbers cancel each other
    // n ^ 0 = n       → 0 does not affect the number
    //
    // Since every number appears twice except one,
    // all duplicate numbers cancel out.
    //
    // 1 ^ 4 ^ 5 ^ 1 ^ 5 ^ 3 ^ 4 ^ 7 ^ 7
    //
    // = (1 ^ 1) ^ (4 ^ 4) ^ (5 ^ 5) ^ (7 ^ 7) ^ 3
    // =   0     ^   0     ^   0     ^   0     ^ 3
    // = 3

    for (int i : nums) {

      // XOR each number with result.
      // Duplicate numbers cancel each other.
      result = result ^ i;
    }

    System.out.println("Non repeating number: " + result);
  }
}
