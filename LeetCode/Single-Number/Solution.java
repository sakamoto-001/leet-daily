1class Solution {
2    public int singleNumber(int[] nums) {
3    //   for(int i = 0; i < nums.length; i++)
4    //   {
5    //             int count = 0;
6    //     for(int j = 0; j < nums.length; j++)
7    //     {
8    //         if(nums[i]==nums[j])
9    //           count ++;
10    //     }
11    //     if(count==1)
12    //           return nums[i];
13    //   }  
14    //return 0;}
15    Map <Integer , Integer> map = new HashMap<>();
16    for(int num : nums)
17    {
18        if(!map.containsKey(num))
19        {
20            map.put(num,0);
21        }
22        map.put(num,map.get(num)+1);
23    }
24    for(int num : nums)
25    {
26        if(map.get(num)==1)
27        {
28            return num;
29        }
30    }
31 return 0;
32    }
33}