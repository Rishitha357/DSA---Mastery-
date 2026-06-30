/*
27. Remove Element

Given an integer array nums and an integer val, remove all occurrences
of val in nums in-place.

The order of the elements may be changed. Then return the number of
elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k.
To get accepted, you need to do the following:

- Change the array nums such that the first k elements contain the
  elements which are not equal to val.
- The remaining elements are not important.
- Return k.

Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]

Example 2:

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,3,0,4,_,_,_]

*/

//CODE:

class Solution {

    public int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}