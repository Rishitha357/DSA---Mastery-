/*
13. Roman to Integer

Roman numerals are represented by seven different symbols:

I = 1
V = 5
X = 10
L = 50
C = 100
D = 500
M = 1000

Roman numerals are usually written largest to smallest from left to right.

There are six special cases where subtraction is used:

I before V or X  -> 4, 9
X before L or C  -> 40, 90
C before D or M  -> 400, 900

Given a roman numeral, convert it to an integer.

Example 1:

Input: s = "III"
Output: 3

Example 2:

Input: s = "LVIII"
Output: 58

Explanation:
L = 50, V = 5, III = 3

Example 3:

Input: s = "MCMXCIV"
Output: 1994

Explanation:
M = 1000, CM = 900, XC = 90, IV = 4

*/

//CODE:

import java.util.*;

class Solution {

    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = map.get(s.charAt(i));

            if (i < s.length() - 1 &&
                current < map.get(s.charAt(i + 1))) {

                result -= current;

            } else {

                result += current;
            }
        }

        return result;
    }
}