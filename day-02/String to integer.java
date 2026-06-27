/*
8. String to Integer (atoi)

Implement the myAtoi(String s) function, which converts a string to a
32-bit signed integer.

The algorithm for myAtoi(String s) is as follows:

1. Ignore any leading whitespace.
2. Check if the next character is '+' or '-'.
3. Read the integer until a non-digit character is encountered.
4. If no digits are found, return 0.
5. If the integer is outside the 32-bit signed integer range
   [-2^31, 2^31 - 1], clamp it to the nearest limit.
6. Return the final integer.

Example 1:

Input: s = "42"
Output: 42

Example 2:

Input: s = "   -042"
Output: -42

Example 3:

Input: s = "1337c0d3"
Output: 1337

Example 4:

Input: s = "0-1"
Output: 0

*/

//CODE:

class Solution {

    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        int sign = 1;

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        int result = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            if (result > Integer.MAX_VALUE / 10 ||
               (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}