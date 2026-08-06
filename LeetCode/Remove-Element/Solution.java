1class Solution {
2    public int removeElement(int[] nums, int val) {
3      int j=0;
4      for(int i=0;i<nums.length;i++)
5      {
6        if(nums[i]!=val)
7        {
8            nums[j]=nums[i];
9            j++;
10        }
11      } 
12      return j; 
13    }
14}