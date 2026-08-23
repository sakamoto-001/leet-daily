1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int sum = 0;
4        int max =0;
5        for(int i = 0; i<nums.length;i++)
6        {
7           if(nums[i]==1)
8           sum++;
9           else if(nums[i]==0)
10           {
11            max=Math.max(max,sum);
12            sum=0;
13           }
14        }
15         return Math.max(max,sum);
16    }
17}