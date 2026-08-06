1class Solution {
2    public int majorityElement(int[] nums) {
3    int n=0;
4    int count=0;
5    for(int num : nums)
6    {
7        if(count==0)
8        {
9            n = num;
10        }
11        if(n == num)
12        {
13            count++;
14        }
15        else 
16        {
17 count--;
18        }
19       
20    }
21    return n;
22    }
23}