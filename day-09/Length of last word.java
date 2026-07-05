/*
58. Length of Last Word

Given a string s consisting of words and spaces, return the length
of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5

Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4

Example 3:

Input: s = "luffy is still joyboy"
Output: 6

*/

//CODE:

class Solution {

    public int lengthOfLastWord(String s) {

        int length = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}