1class Solution {
2    public int thirdMax(int[] nums) {
3        Long first = null,
4        second = null,
5        third = null;
6        for( int i : nums)
7        {
8            if(first != null && i == first || second != null && i == second || third != null && i == third)
9            continue;
10            
11            if(first == null || i > first)
12            {
13                third = second;
14                second = first;
15                first = (long)i;
16            }
17            else if(second == null || i > second)
18            {
19                third = second;
20                second = (long)i;
21            }
22            else if(third == null || i > third)
23            {
24                third = (long)i;
25            }
26        }
27        return third == null ? first.intValue() : third.intValue();
28
29    }
30}