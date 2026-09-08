1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int ptr = nums.length-1;
4        for(int i = nums.length-1; i >=0; i--)
5        {
6            if(nums[i] % 2 != 0)
7            {
8                int temp = nums[i];
9                nums[i] = nums[ptr];
10                nums[ptr] = temp;
11                ptr --;
12            }
13        }
14        return nums;
15    }
16}