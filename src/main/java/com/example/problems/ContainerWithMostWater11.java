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

  // hash c - 'a'
  public boolean canConstructBetter(String ransomNote, String magazine) {
    if (ransomNote.length() > magazine.length()) {
      return false;
    }
    int[] cnt = new int[26];
    for (char c : magazine.toCharArray()) {
      cnt[c - 'a']++;
    }
    for (char c : ransomNote.toCharArray()) {
      cnt[c - 'a']--;
      if (cnt[c - 'a'] < 0) {
        return false;
      }
    }
    return true;
  }
}
