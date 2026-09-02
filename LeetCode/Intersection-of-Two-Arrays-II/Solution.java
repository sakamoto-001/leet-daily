1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        // Arrays.sort(nums1);
4        // Arrays.sort(nums2);
5        // int[] ans = new int[nums1.length];
6        // int k = 0, i = 0, j = 0;
7        // while(i < nums1.length && j < nums2.length)
8        // {
9        //     if(nums1[i]==nums2[j])
10        //     {
11        //         ans[k]=nums1[i];
12        //         k+=1;
13        //         i+=1;
14        //         j+=1;
15        //     }
16        //     else if(nums1[i]<nums2[j])
17        //     {
18        //         i+=1;
19        //     }
20        //     else
21        //     {
22        //         j+=1;
23        //     }
24        // }
25
26          if(nums1.length > nums2.length)
27        {
28            return intersect(nums2,nums1);
29        }
30        Map<Integer,Integer>map = new HashMap<>();
31        for(int num : nums1)
32        {
33            map.put(num,map.getOrDefault(num,0)+1);
34        }
35        int[] ans = new int[nums1.length];
36        int k = 0;
37        for(int num : nums2)
38        {
39            int count = map.getOrDefault(num,0);
40            if(count == 0)
41            continue;
42            else
43            {
44                ans[k]=num;
45                k+=1;
46                map.put(num,count-1);
47            }
48
49        }
50        return Arrays.copyOfRange(ans,0,k);
51    }
52}