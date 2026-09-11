1class Solution {
2    public int arrayPairSum(int[] nums) {
3        Arrays.sort(nums);
4        int sum = 0;
5        for(int i = 0; i < nums.length;i=i+2)
6        {
7          sum += nums[i];
8        }
9        return sum;
10    }
11}