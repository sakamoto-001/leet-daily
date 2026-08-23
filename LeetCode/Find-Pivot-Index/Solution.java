1class Solution {
2    public int pivotIndex(int[] nums) {
3        int leftsum=0;
4        for(int i = 0; i < nums.length; i++)
5        {
6            leftsum += nums[i];
7        }
8        int rightsum=0;
9        for(int i = 0; i < nums.length; i++)
10        {   leftsum -= nums[i];
11            if(leftsum == rightsum)
12            {
13                return i;
14            }
15            
16            rightsum += nums[i];
17        }
18       return -1;
19    }
20}