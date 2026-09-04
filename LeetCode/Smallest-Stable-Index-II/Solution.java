1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3         int n = nums.length;
4       int mini[] = new int [n];
5       mini[n-1]=nums[n-1];
6       for(int i = n-2; i >=0 ; i--)
7       {
8        mini[i] = Math.min(mini[i+1],nums[i]);
9       }
10       int maxi = nums[0];
11       for(int i = 0; i < n; i++)
12       {
13            maxi = Math.max(maxi,nums[i]);
14            if(maxi-mini[i] <= k)
15            {
16                return i;
17            }
18       }
19       return -1;
20    }
21}