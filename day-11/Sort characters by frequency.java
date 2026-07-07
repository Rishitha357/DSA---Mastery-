/*
451. Sort Characters By Frequency

Given a string s, sort it in decreasing order based on the frequency
of the characters.

The frequency of a character is the number of times it appears in the
string.

Return the sorted string. If there are multiple answers, return any of them.

Example 1:

Input: s = "tree"
Output: "eert"

Explanation:
'e' appears twice while 'r' and 't' appear once.

Example 2:

Input: s = "cccaaa"
Output: "aaaccc"

Example 3:

Input: s = "Aabb"
Output: "bbAa"

*/

//CODE:

import java.util.*;

class Solution {

    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Max Heap based on frequency
        PriorityQueue<Character> maxHeap = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        maxHeap.addAll(map.keySet());

        StringBuilder result = new StringBuilder();

        while (!maxHeap.isEmpty()) {

            char ch = maxHeap.poll();

            for (int i = 0; i < map.get(ch); i++) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}