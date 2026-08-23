1class Solution {
2    public int findNumbers(int[] nums) {
3        int ans=0;
4        for(int i : nums)
5        {   int temp =i;
6            int count =0;
7            while(temp>0){
8                temp /=10;
9                count++;
10            }
11            if(count%2==0)
12            ans++;
13        }
14        return ans;
15    }
16}