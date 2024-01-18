package problems;

import java.util.Arrays;

/** */
public class MergeSortedArray88 {
  public void solutionBest(int[] nums1, int m, int[] nums2, int n) {
    // solution 1 at :
    int num1Index = m - 1;
    int num2Index = n - 1;
    int tail = m + n - 1;
    int current = 0;
    while (num1Index >= 0 || num2Index >= 0) {
      if (num1Index == -1) {
        current = nums2[num2Index--];
      } else if (num2Index == -1) {
        current = nums1[num1Index--];
      } else if (nums1[num1Index] >= nums2[num2Index]) {
        current = nums1[num1Index--];
      } else {
        current = nums2[num2Index--];
      }

      nums1[tail--] = current;
    }
  }

  public void solutionEasy(int[] nums1, int m, int[] nums2, int n) {
    if (n != 0) {

      for (int i = 0; i < nums2.length; i++) {
        nums1[i + m] = nums2[i];
      }
      Arrays.sort(nums1);
    }
  }
}
