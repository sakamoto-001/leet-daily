1class Solution {
2    public int findNumbers(int[] nums) {
3        int ans =0;
4        for(int i : nums)
5        {
6            int temp = i;
7            int count = 0;
8            while(temp>0)
9            {
10                temp/=10;
11                count++;
12            }
13            if(count%2==0)
14            {
15                ans++;
16            }
17        }
18        return ans;
19    }
20}