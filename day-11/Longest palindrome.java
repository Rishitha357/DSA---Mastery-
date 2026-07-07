/*
409. Longest Palindrome

Given a string s which consists of lowercase or uppercase letters,
return the length of the longest palindrome that can be built with
those letters.

Letters are case sensitive, so 'A' and 'a' are considered different.

Example 1:

Input: s = "abccccdd"
Output: 7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.

Example 2:

Input: s = "a"
Output: 1

Example 3:

Input: s = "bb"
Output: 2

*/

//CODE:

import java.util.*;

class Solution {

    public int longestPalindrome(String s) {

        HashSet<Character> set = new HashSet<>();
        int length = 0;

        for (char ch : s.toCharArray()) {

            if (set.contains(ch)) {
                set.remove(ch);
                length += 2;
            } else {
                set.add(ch);
            }
        }

        if (!set.isEmpty()) {
            length++;
        }

        return length;
    }
}