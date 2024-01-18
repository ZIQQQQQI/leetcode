package com.example.problems;

import java.util.Arrays;

/** */
public class RemoveDuplicatesFromSortedArray26 {
  public int removeDuplicates(int[] nums) {
    int[] result = Arrays.stream(nums).distinct().toArray();
    int count = result.length;
    System.arraycopy(result, 0, nums, 0, count - 1 + 1);

    return count;
  }

  public int better(int[] nums) {
    int left = 0;
    int right = 1;
    int n = 1;
    int length = nums.length;
    if (length == 1) {
      return n;
    }

    while (right < length) {
      if (nums[left] == nums[right]) {
        right++;
      } else {
        nums[left + 1] = nums[right];
        left++;
        right++;
        n++;
      }
    }

    return n;
  }
}
