package com.example.problems;

import java.util.Arrays;

/** */
public class RemoveElement27 {
  public int removeElement(int[] nums, int val) {
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == val) {
        nums[i] = Integer.MAX_VALUE;
        index++;
      }
    }

    Arrays.sort(nums);
    return (int) Arrays.stream(nums).count() - index;
  }

  public int betterElement(int[] nums, int val) {
    int n = nums.length;
    int left = 0;
    for (int right = 0; right < n; right++) {
      if (nums[right] != val) {
        nums[left] = nums[right];
        left++;
      }
    }
    return left;
  }

  public int bestElement(int[] nums, int val) {
    int left = 0;
    int right = nums.length;
    while (left < right) {
      if (nums[left] == val) {
        nums[left] = nums[right - 1];
        right--;
      } else {
        left++;
      }
    }
    return left;
  }
}
