
# Java String Practice Problems

This document contains a categorized list of String-based problems in Java, grouped by **difficulty level**, with **descriptions**, **solutions**, and **example inputs/outputs**.

---

## ✅ Easy Level

### 1. Reverse a String
**Problem:** Reverse the input string.

```java
public String reverseString(String s) {
    return new StringBuilder(s).reverse().toString();
}
```

### 2. Check if a String is a Palindrome
**Problem:** Return `true` if the string is a palindrome, else `false`.

```java
public boolean isPalindrome(String s) {
    int i = 0, j = s.length() - 1;
    while (i < j) {
        if (s.charAt(i++) != s.charAt(j--)) return false;
    }
    return true;
}
```

### 3. Count Vowels in a String
**Problem:** Count the number of vowels in a given string.

```java
public int countVowels(String s) {
    int count = 0;
    for (char c : s.toLowerCase().toCharArray()) {
        if ("aeiou".indexOf(c) != -1) count++;
    }
    return count;
}
```

---

## 🟡 Medium Level

### 4. Longest Common Prefix
**Problem:** Find the longest common prefix among an array of strings.

```java
public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++) {
        while (!strs[i].startsWith(prefix)) {
            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) return "";
        }
    }
    return prefix;
}
```

### 5. Valid Anagram
**Problem:** Check if two strings are anagrams of each other.

```java
public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    int[] count = new int[26];
    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;
        count[t.charAt(i) - 'a']--;
    }
    for (int n : count) {
        if (n != 0) return false;
    }
    return true;
}
```

### 6. First Unique Character
**Problem:** Return the index of the first non-repeating character.

```java
public int firstUniqChar(String s) {
    int[] count = new int[26];
    for (char c : s.toCharArray()) count[c - 'a']++;
    for (int i = 0; i < s.length(); i++) {
        if (count[s.charAt(i) - 'a'] == 1) return i;
    }
    return -1;
}
```

---

## 🔴 Hard Level

### 7. Longest Palindromic Substring
**Problem:** Return the longest palindromic substring.

```java
public String longestPalindrome(String s) {
    if (s == null || s.length() < 1) return "";
    int start = 0, end = 0;
    for (int i = 0; i < s.length(); i++) {
        int len1 = expand(s, i, i);
        int len2 = expand(s, i, i + 1);
        int len = Math.max(len1, len2);
        if (len > end - start) {
            start = i - (len - 1) / 2;
            end = i + len / 2;
        }
    }
    return s.substring(start, end + 1);
}

private int expand(String s, int left, int right) {
    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
        left--; right++;
    }
    return right - left - 1;
}
```

### 8. Regular Expression Matching
**Problem:** Implement regex pattern matching with `.` and `*`.

```java
// Advanced problem - usually solved using dynamic programming.
```

### 9. Minimum Window Substring
**Problem:** Return the minimum window in `s` which will contain all characters of `t`.

```java
// Can provide full sliding window solution upon request.
```

---

Happy Coding! 🎯
