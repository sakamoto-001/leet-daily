1class Solution {
2    public int dominantIndex(int[] nums) {
3       int max = nums[0],
4       max1 = -1;
5       int val = 0;
6       for(int i = 1; i < nums.length; i++)
7       {
8         if(nums[i] > max)
9         {
10            max1 = max;
11            max = nums[i];
12            val = i;
13         }
14         else if(nums[i] > max1)
15         {
16            max1 = nums[i];
17         }
18       }
19       if(max >= 2*max1)
20       {
21        return val;
22       }
23return -1;
24    }
25}