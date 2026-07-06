/*
709. To Lower Case

Given a string s, return the string after replacing every uppercase
letter with the same lowercase letter.

Example 1:

Input: s = "Hello"
Output: "hello"

Example 2:

Input: s = "here"
Output: "here"

Example 3:

Input: s = "LOVELY"
Output: "lovely"

*/

//CODE:

class Solution {

    public String toLowerCase(String s) {

        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch >= 'A' && ch <= 'Z') {
                result.append((char)(ch + ('a' - 'A')));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}