1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int sum = 0,max =0;
4        for(int i = 0; i<nums.length;i++)
5        {
6           if(nums[i]==1)
7           sum++;
8           else {
9            max=Math.max(max,sum);
10            sum=0;
11           }
12        }
13         return Math.max(max,sum);
14    }
15}