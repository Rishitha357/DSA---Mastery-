Problem: Running Sum of 1D Array

Approach:
- Start from the second element.
- Add the previous element's running sum to the current element.
- Return the modified array.

Time Complexity: O(n)
Space Complexity: O(1)

Code:

class Solution {
    public int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }
}