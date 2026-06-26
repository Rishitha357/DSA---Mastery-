Problem: Richest Customer Wealth

Approach:
- Traverse each customer's accounts.
- Calculate the total wealth by summing all account balances.
- Keep track of the maximum wealth.

Time Complexity: O(m × n)
Space Complexity: O(1)

Code:

class Solution {
    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {

            int wealth = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }

            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }

        return maxWealth;
    }
}