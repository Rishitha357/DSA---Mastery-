/*
771. Jewels and Stones

You're given strings jewels representing the types of stones that are
jewels, and stones representing the stones you have.

Each character in stones is a type of stone you have.

Return the number of stones that are also jewels.

Letters are case sensitive, so 'a' is considered a different type of
stone from 'A'.

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0

*/

//CODE:

import java.util.*;

class Solution {

    public int numJewelsInStones(String jewels, String stones) {

        HashSet<Character> set = new HashSet<>();

        for (char ch : jewels.toCharArray()) {
            set.add(ch);
        }

        int count = 0;

        for (char ch : stones.toCharArray()) {

            if (set.contains(ch)) {
                count++;
            }
        }

        return count;
    }
}