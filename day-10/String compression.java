/*
443. String Compression

Given an array of characters chars, compress it using the following
algorithm:

Begin with an empty string s. For each group of consecutive repeating
characters in chars:

- If the group's length is 1, append the character to s.
- Otherwise, append the character followed by the group's length.

The compressed string should not be returned separately, but instead
be stored in the input character array chars.

Note that group lengths of 10 or more are split into multiple
characters.

After modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.

Example 1:

Input: chars = ['a','a','b','b','c','c','c']
Output: 6, chars = ['a','2','b','2','c','3']

Example 2:

Input: chars = ['a']
Output: 1, chars = ['a']

Example 3:

Input: chars = ['a','b','b','b','b','b','b','b','b','b','b','b','b']
Output: 4, chars = ['a','b','1','2']

*/

//CODE:

class Solution {

    public int compress(char[] chars) {

        int index = 0;
        int i = 0;

        while (i < chars.length) {

            char current = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            chars[index++] = current;

            if (count > 1) {

                String str = String.valueOf(count);

                for (char c : str.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}