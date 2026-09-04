1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n = nums.length;
4        k%=n;
5        reverse(nums,0,n-1);
6        reverse(nums,0,k-1);
7        reverse(nums,k,n-1);
8    }
9        private void reverse(int[] nums,int left,int right)
10        {
11            while(left<right)
12            {
13                int temp = nums[left];
14                nums[left]= nums[right];
15                nums[right]=temp;
16                left++;
17                right--;
18            }
19        }
20    
21}