/*
1832. Check if the Sentence Is Pangram

A pangram is a sentence where every letter of the English alphabet
appears at least once.

Given a string sentence containing only lowercase English letters,
return true if sentence is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true

Explanation:
The sentence contains every letter of the English alphabet at least once.

Example 2:

Input: sentence = "leetcode"
Output: false

*/

//CODE:

class Solution {

    public boolean checkIfPangram(String sentence) {

        boolean[] seen = new boolean[26];
        int count = 0;

        for (char ch : sentence.toCharArray()) {

            if (!seen[ch - 'a']) {
                seen[ch - 'a'] = true;
                count++;
            }
        }

        return count == 26;
    }
}