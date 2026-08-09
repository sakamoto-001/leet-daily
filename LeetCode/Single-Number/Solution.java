1class Solution {
2    public int singleNumber(int[] nums) {
3      for(int i = 0; i < nums.length; i++)
4      {
5                int count = 0;
6        for(int j = 0; j < nums.length; j++)
7        {
8            if(nums[i]==nums[j])
9              count ++;
10        }
11        if(count==1)
12              return nums[i];
13      }  
14 return 0;}
15}