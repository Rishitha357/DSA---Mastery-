Problem: Find Numbers with Even Number of Digits

Approach:
- Traverse the array.
- Count the number of digits in each element.
- If the number of digits is even, increment the count.

Time Complexity: O(n)
Space Complexity: O(1)

Code:

class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;

        for (int num : nums) {

            int digits = String.valueOf(num).length();

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}