1class Solution {
2    public int findMiddleIndex(int[] nums) {
3       int sum = 0;
4       for(int i = 0; i < nums.length; i++){
5        sum += nums[i];
6       } 
7       int sum2 = 0;
8      for(int i = 0; i < nums.length; i++){
9         sum -= nums[i];
10         if(sum == sum2)
11         {
12            return i;
13         }
14         
15         sum2 += nums[i];
16       }
17       return -1;
18    }
19}