package com.example.problems;

/** */
public class RansomNote383 {
  public boolean canConstruct(String ransomNote, String magazine) {
    for (int i = 0; i < ransomNote.length(); i++) {
      String c = String.valueOf(ransomNote.charAt(i));
      if (!magazine.contains(c)) {
        return false;
      }
      magazine = magazine.replaceFirst(c, "");
    }
    return true;
  }
}
