/*
2255. Count Prefixes of a Given String

You are given a string array words and a string s, where words[i] and s
comprise only of lowercase English letters.

Return the number of strings in words that are a prefix of s.

A prefix of a string is a substring that occurs at the beginning of a
string.

Example 1:

Input: words = ["a","b","c","ab","bc","abc"], s = "abc"
Output: 3

Explanation:
The prefixes of "abc" are:
"a", "ab", and "abc".

Example 2:

Input: words = ["a","a"], s = "aa"
Output: 2

*/

//CODE:

class Solution {

    public int countPrefixes(String[] words, String s) {

        int count = 0;

        for (String word : words) {

            if (s.startsWith(word)) {
                count++;
            }
        }

        return count;
    }
}