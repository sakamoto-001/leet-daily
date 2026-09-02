1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        if(nums1.length > nums2.length)
4        {
5            return intersect(nums2,nums1);
6        }
7        Arrays.sort(nums1);
8        Arrays.sort(nums2);
9        int[] ans = new int[nums1.length];
10        int k = 0;
11        int i = 0,j = 0;
12        while(i < nums1.length && j < nums2.length)
13        {
14            if(nums1[i]==nums2[j])
15            {
16                ans[k]=nums1[i];
17                k+=1;
18                i+=1;
19                j+=1;
20            }
21            else if(nums1[i]<nums2[j])
22            {
23                i+=1;
24            }
25            else
26            {
27                j+=1;
28            }
29        }
30        return Arrays.copyOf(ans,k);
31    }
32}