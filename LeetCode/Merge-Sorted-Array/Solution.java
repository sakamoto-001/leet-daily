1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3      int p1 = m-1;
4      int p2 = n-1;
5      for(int p = m + n-1; p >= 0; p --)
6      {
7        if(p2 < 0)
8        {
9            break;
10        }
11        if(p1 >= 0 && nums1[p1] > nums2[p2]){
12          nums1[p] = nums1[p1];
13          p1--;
14        }
15        else{
16            nums1[p] = nums2[p2];
17            p2--;
18        }
19      }
20    }
21}