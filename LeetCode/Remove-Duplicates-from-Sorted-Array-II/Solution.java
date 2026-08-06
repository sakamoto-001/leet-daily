1class Solution {
2    public int removeDuplicates(int[] nums) {
3         int j=2;
4         for(int i=2; i<nums.length;i++)
5         {
6             if(nums[i]!=nums[j-2])
7             {
8                 nums[j]=nums[i];
9                 j++;
10             }
11            
12         }
13         return j;  
14
15    }
16}