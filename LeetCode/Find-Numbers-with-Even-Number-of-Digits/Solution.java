1class Solution {
2    public int findNumbers(int[] nums) {
3        int count = 0;
4       for(int num : nums)
5       {
6        if(num >= 10 && num <= 99 || num >= 1000 && num <= 9999 || num == 100000)
7        count++;
8       }
9       return count;
10    }
11}