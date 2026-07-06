/*
205. Isomorphic Strings

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be
replaced to get t.

All occurrences of a character must be replaced with another character
while preserving the order of characters.

No two characters may map to the same character, but a character may
map to itself.

Example 1:

Input: s = "egg", t = "add"
Output: true

Example 2:

Input: s = "foo", t = "bar"
Output: false

Example 3:

Input: s = "paper", t = "title"
Output: true

*/

//CODE:

import java.util.*;

class Solution {

    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map.containsKey(c1)) {

                if (map.get(c1) != c2) {
                    return false;
                }

            } else {

                if (used.contains(c2)) {
                    return false;
                }

                map.put(c1, c2);
                used.add(c2);
            }
        }

        return true;
    }
}