package com.example.problems;

/** */
public class RemoveDuplicatesFromSortedArrayHarder80 {
  public int removeDuplicates(int[] nums) {
    int n = nums.length;
    if (n <= 2) {
      return n;
    }
    int left = 2, right = 2;
    while (right < n) {
      if (nums[left - 2] != nums[right]) {
        nums[left] = nums[right];
        ++left;
      }
      ++right;
    }
    return left;
  }
}
