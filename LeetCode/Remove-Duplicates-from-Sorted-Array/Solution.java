1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int j=1;
4        for(int i=1;i<nums.length;i++)
5        {
6            if(nums[i]!= nums[j-1])
7            {
8                nums[j]=nums[i];
9                j++;
10            }
11        }
12        return j;
13    }
14}