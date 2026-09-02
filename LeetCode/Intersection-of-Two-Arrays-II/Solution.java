1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        if(nums1.length > nums2.length)
4        {
5            return intersect(nums2,nums1);
6        }
7        Arrays.sort(nums1);
8        Arrays.sort(nums2);
9        int[] ans = new int[nums1.length];
10        int k = 0, i = 0,j = 0;
11        while(i < nums1.length && j < nums2.length)
12        {
13            if(nums1[i]==nums2[j])
14            {
15                ans[k]=nums1[i];
16                k+=1;
17                i+=1;
18                j+=1;
19            }
20            else if(nums1[i]<nums2[j])
21            {
22                i+=1;
23            }
24            else
25            {
26                j+=1;
27            }
28        }
29        return Arrays.copyOf(ans,k);
30    }
31}