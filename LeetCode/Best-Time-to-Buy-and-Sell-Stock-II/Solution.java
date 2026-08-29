1class Solution {
2    public int maxProfit(int[] prices) {
3        int max = 0; // maximumprice
4        for(int i = 1; i < prices.length; i++)
5        {
6            if(prices[i]>prices[i-1])
7            {
8                // adding the max profit of day.
9                max += prices[i]-prices[i-1];
10            }
11        }
12        return max; // returning maxmimum price
13    }
14} 