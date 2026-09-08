1class Solution {
2    public int heightChecker(int[] heights) {
3        int count = 0;
4        int nums[] = Arrays.copyOf(heights,heights.length);
5         Arrays.sort(nums);
6        for(int i = 0 ; i < nums.length; i++)
7        {
8            if(nums[i]!=heights[i])
9            count ++;
10        }
11        return count;
12    }
13}