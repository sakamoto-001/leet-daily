1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3      int left = 0;
4      int sum = 0;
5      int min = Integer.MAX_VALUE;
6      for(int right = 0; right < nums.length; right++)  
7      {
8        sum += nums [right];
9        while(sum >= target)
10        {
11             min = Math.min(min,right-left+1);
12            sum -= nums[left++];
13        }
14      }
15      return min == Integer.MAX_VALUE ? 0 : min;
16    }
17}