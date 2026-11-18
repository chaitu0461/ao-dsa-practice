
package arrays.hard;

public class CountInversions {

  /*
   * An inversion is a pair of indices (i, j) such that:
   * 1. i < j
   * 2. nums[i] > nums[j]
   *
   * Approach: Modified Merge Sort
   *
   * We divide the array into two halves and count three types
   * of inversions:
   *
   * 1. Left inversions:
   *    Inversions where both elements belong to the left half.
   *
   * 2. Right inversions:
   *    Inversions where both elements belong to the right half.
   *
   * 3. Cross inversions:
   *    Inversions where the first element belongs to the left
   *    half and the second element belongs to the right half.
   *
   * The first two types are counted recursively.
   * Cross inversions are counted during the merge operation.
   *
   * Since both halves are sorted before merging, whenever
   * nums[leftIndex] > nums[rightIndex], all remaining elements
   * in the left half are also greater than nums[rightIndex].
   *
   * Therefore, we can count all those inversions at once using:
   *
   * mid - leftIndex + 1
   */

  public static void main(String[] args) {

    int[] nums = {2, 3, 7, 1, 3, 5};

    long inversions = numberOfInversions(nums);

    System.out.println(inversions);
  }

  private static long numberOfInversions(int[] nums) {

    return mergeSort(nums, 0, nums.length - 1);
  }

  private static long mergeSort(int[] nums, int low, int high) {

    // Base case: A single-element array has no inversions.
    if (low >= high) {
      return 0;
    }

    int mid = low + (high - low) / 2;

    long count = 0;

    // Count inversions within the left half.
    count += mergeSort(nums, low, mid);

    // Count inversions within the right half.
    count += mergeSort(nums, mid + 1, high);

    // Count inversions across the left and right halves.
    count += merge(nums, low, mid, high);

    return count;
  }

  private static long merge(int[] nums, int low, int mid, int high) {

    long crossInversions = 0;

    int leftIndex = low;
    int rightIndex = mid + 1;
    int tempIndex = 0;

    int[] temp = new int[high - low + 1];

    // Merge both sorted halves while counting cross inversions.
    while (leftIndex <= mid && rightIndex <= high) {

      if (nums[leftIndex] > nums[rightIndex]) {

        // Right element is smaller.
        // All remaining elements in the left half
        // will also form inversions with this element.

        temp[tempIndex++] = nums[rightIndex++];

        crossInversions += mid - leftIndex + 1;

      } else {

        // Left element is smaller or equal.
        // No cross inversion with the current right element.

        temp[tempIndex++] = nums[leftIndex++];
      }
    }

    // Copy any remaining elements from the left half.
    while (leftIndex <= mid) {
      temp[tempIndex++] = nums[leftIndex++];
    }

    // Copy any remaining elements from the right half.
    while (rightIndex <= high) {
      temp[tempIndex++] = nums[rightIndex++];
    }

    // Copy the sorted elements back into the original array.
    for (int i = 0; i < temp.length; i++) {
      nums[low + i] = temp[i];
    }

    return crossInversions;
  }
}
