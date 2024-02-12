package com.example.leetcode;

import com.example.problems.IsPalindrome125;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeetcodeApplication {

  public static void main(String[] args) {
    SpringApplication.run(LeetcodeApplication.class, args);
    IsPalindrome125 removeDuplicatesFromSortedArray26 = new IsPalindrome125();
    removeDuplicatesFromSortedArray26.isPalindrome("A man, a plan, a canal: Panama");
  }
}
