1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        Set <Integer> s1 = new HashSet <>();
4        Set <Integer> s2 = new HashSet <>();
5        for(int num : nums1)
6        {
7            s1.add(num);
8        }
9        for(int num : nums2)
10        {
11            s2.add(num);
12        }
13        if(s1.size() < s2.size())
14        {
15            int[] ans = new int[s1.size()]; 
16            int k = 0;
17            for(int num : s1)
18            {
19             if(s2.contains(num))
20             {
21                ans[k++] = num;
22             }
23            }
24            return Arrays.copyOf(ans,k);
25        }
26        else{
27            int[] ans = new int[s2.size()]; 
28            int k = 0;
29            for(int num : s2)
30            {
31             if(s1.contains(num))
32             {
33                ans[k++] = num;
34             }
35            }
36            return Arrays.copyOf(ans,k);
37        }
38        }
39    }