1class Solution {
2    public int maxProfit(int[] prices) {
3       int min = Integer.MAX_VALUE;
4       int max = 0;
5       for(int p: prices)
6       {
7        if(p < min)
8        {
9            min = p;
10        }
11        if(p - min > max)
12        {
13            max = p-min;
14        }
15       }
16       return max;
17    }
18}