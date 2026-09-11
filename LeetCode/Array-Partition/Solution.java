1class Solution {
2    public int arrayPairSum(int[] nums) {
3       int[] freq = new int[20001];
4       int sum = 0;
5       for(int n : nums)
6       {
7          freq[n+10000]++;
8       }
9       boolean sign = true;
10       for(int i = 0; i < 20001; i++)
11       {
12        while(freq[i]>0)
13        {
14            if(sign)
15            {
16                sum += i-10000;
17            }
18            sign = !sign;
19            freq[i]--;
20        }
21       }
22       return sum;
23    }
24}