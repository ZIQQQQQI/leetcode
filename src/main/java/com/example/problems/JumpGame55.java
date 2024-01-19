package com.example.problems;

/** */
public class JumpGame55 {
  public boolean canJump(int[] nums) {
    if (nums.length == 1) return true;
    int needpath = 1;
    for (int i = nums.length - 2; i > 0; i--) {
      if (nums[i] < needpath) {
        needpath++;
      } else {
        needpath = 1;
      }
    }

    return nums[0] >= needpath;
  }
}
