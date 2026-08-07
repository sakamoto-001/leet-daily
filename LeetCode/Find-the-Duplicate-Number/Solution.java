1class Solution {
2    public int findDuplicate(int[] nums) {
3        Arrays.sort(nums);
4        int i = 1;
5        while(i<nums.length)
6        {
7            if(nums[i]==nums[i-1])
8            return nums[i];
9            else i++;
10        }
11  return -1;  }
12}