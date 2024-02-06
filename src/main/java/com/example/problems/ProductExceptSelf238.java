package com.example.problems;

import java.util.Arrays;

/** */
public class ProductExceptSelf238 {
  public int[] productExceptSelf(int[] nums) {
    var stream = Arrays.stream(nums);
    var zeroCount = stream.filter(num -> num == 0).count();
    if (zeroCount > 1) {
      Arrays.fill(nums, 0);
    } else {
      int sum = Arrays.stream(nums).filter(num -> num != 0).reduce(1, (x, y) -> x * y);
      if (zeroCount == 1) {
        for (int i = 0; i < nums.length; i++) {
          if (nums[i] == 0) {
            nums[i] = sum;
          } else {
            nums[i] = 0;
          }
        }
      } else {
        for (int i = 0; i < nums.length; i++) {
          nums[i] = sum / nums[i];
        }
      }
    }

    return nums;
  }

  public int[] better(int[] nums) {
    int length = nums.length;
    int[] answer = new int[length];

    // answer[i] 表示索引 i 左侧所有元素的乘积
    // 因为索引为 '0' 的元素左侧没有元素， 所以 answer[0] = 1
    answer[0] = 1;
    for (int i = 1; i < length; i++) {
      answer[i] = nums[i - 1] * answer[i - 1];
    }

    // R 为右侧所有元素的乘积
    // 刚开始右边没有元素，所以 R = 1
    int R = 1;
    for (int i = length - 1; i >= 0; i--) {
      // 对于索引 i，左边的乘积为 answer[i]，右边的乘积为 R
      answer[i] = answer[i] * R;
      // R 需要包含右边所有的乘积，所以计算下一个结果时需要将当前值乘到 R 上
      R *= nums[i];
    }
    return answer;

  }
}
