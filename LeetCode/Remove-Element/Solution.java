1class Solution {
2    public int removeElement(int[] nums, int val) {
3      int i=0;
4      int n = nums.length;
5      while(i<n)
6      {
7        if(nums[i] == val)
8        {
9            nums[i] = nums[n-1];
10            n--;
11        }
12        else
13        {
14            i++;
15        }
16      }
17      return n;
18    }
19}