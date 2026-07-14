/*
2000. Reverse Prefix of Word

Given a 0-indexed string word and a character ch, reverse the segment
of word that starts at index 0 and ends at the index of the first
occurrence of ch (inclusive).

If the character ch does not exist in word, return the original word.

Example 1:

Input: word = "abcdefd", ch = 'd'
Output: "dcbaefd"

Explanation:
The first occurrence of 'd' is at index 3.
Reverse the substring from index 0 to 3.

Example 2:

Input: word = "xyxzxe", ch = 'z'
Output: "zxyxxe"

Example 3:

Input: word = "abcd", ch = 'z'
Output: "abcd"

*/

//CODE:

class Solution {

    public String reversePrefix(String word, char ch) {

        char[] chars = word.toCharArray();

        int index = word.indexOf(ch);

        if (index == -1) {
            return word;
        }

        int left = 0;
        int right = index;

        while (left < right) {

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }
}