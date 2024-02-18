package com.example.leetcode;

import com.example.problems.IsSubsequence392;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeetcodeApplication {

  public static void main(String[] args) {
    SpringApplication.run(LeetcodeApplication.class, args);
    IsSubsequence392 removeDuplicatesFromSortedArray26 = new IsSubsequence392();
    removeDuplicatesFromSortedArray26.isSubsequence("abc", "ahbgdc");
  }
}
