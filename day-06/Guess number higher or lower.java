/*
374. Guess Number Higher or Lower

We are playing the Guess Game.

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked
is higher or lower than your guess.

You call a pre-defined API:

    int guess(int num)

which returns:

-1 : Your guess is higher than the picked number.
 1 : Your guess is lower than the picked number.
 0 : Your guess is equal to the picked number.

Return the number that I picked.

Example 1:

Input: n = 10, pick = 6
Output: 6

Example 2:

Input: n = 1, pick = 1
Output: 1

Example 3:

Input: n = 2, pick = 1
Output: 1

*/

//CODE:

/* The guess API is defined in the parent class GuessGame.
   int guess(int num); */

public class Solution extends GuessGame {

    public int guessNumber(int n) {

        int left = 1;
        int right = n;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int result = guess(mid);

            if (result == 0) {
                return mid;
            } else if (result == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}