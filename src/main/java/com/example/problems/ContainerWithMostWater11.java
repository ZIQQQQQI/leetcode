package com.example.problems;

/** */
public class ContainerWithMostWater11 {
  public int maxArea(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int max = 0;
    while (left < right) {
      int min = Math.min(height[left], height[right]);
      if (min * (right - left) > max) {
        max = min * (right - left);
      }

      if (height[left] == min) {
        left++;
      } else {
        right--;
      }
    }
    return max;
  }
}
