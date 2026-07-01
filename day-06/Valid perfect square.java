/*
367. Valid Perfect Square

Given a positive integer num, return true if num is a perfect square
or false otherwise.

A perfect square is an integer that is the square of an integer.
In other words, it is the product of some integer with itself.

You must not use any built-in library function, such as sqrt.

Example 1:

Input: num = 16
Output: true

Explanation: 4 * 4 = 16

Example 2:

Input: num = 14
Output: false

Explanation: There is no integer whose square is 14.

*/

//CODE:

class Solution {

    public boolean isPerfectSquare(int num) {

        int left = 1;
        int right = num;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}