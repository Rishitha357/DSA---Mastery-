/*
394. Decode String

Given an encoded string, return its decoded string.

The encoding rule is:

k[encoded_string]

where the encoded_string inside the square brackets is repeated exactly
k times.

You may assume that:
- The input string is always valid.
- There are no extra white spaces.
- Square brackets are well-formed.
- The original data does not contain any digits.
- Digits are only used for repeat counts.

Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"

Example 2:

Input: s = "3[a2[c]]"
Output: "accaccacc"

Example 3:

Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"

*/

//CODE:

import java.util.*;

class Solution {

    public String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder current = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {

                k = k * 10 + (ch - '0');

            } else if (ch == '[') {

                countStack.push(k);
                stringStack.push(current);

                current = new StringBuilder();
                k = 0;

            } else if (ch == ']') {

                int repeat = countStack.pop();
                StringBuilder previous = stringStack.pop();

                for (int i = 0; i < repeat; i++) {
                    previous.append(current);
                }

                current = previous;

            } else {

                current.append(ch);
            }
        }

        return current.toString();
    }
}