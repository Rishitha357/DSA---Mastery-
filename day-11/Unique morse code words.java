/*
804. Unique Morse Code Words

International Morse Code defines a standard encoding where each letter
is mapped to a series of dots and dashes.

Given an array of strings words, where each word can be written as the
concatenation of the Morse code of each letter, return the number of
different transformations among all words.

The Morse code mapping is:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
"-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
"..-","...-",".--","-..-","-.--","--.."]

Example 1:

Input: words = ["gin","zen","gig","msg"]
Output: 2

Explanation:
"gin"  -> "--...-."
"zen"  -> "--...-."
"gig"  -> "--...--."
"msg"  -> "--...--."

There are 2 different transformations.

Example 2:

Input: words = ["a"]
Output: 1

*/

//CODE:

import java.util.*;

class Solution {

    public int uniqueMorseRepresentations(String[] words) {

        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",
            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-","-.--","--.."
        };

        HashSet<String> set = new HashSet<>();

        for (String word : words) {

            StringBuilder code = new StringBuilder();

            for (char ch : word.toCharArray()) {
                code.append(morse[ch - 'a']);
            }

            set.add(code.toString());
        }

        return set.size();
    }
}