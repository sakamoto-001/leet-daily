1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3      List<List<Integer>> ans = new ArrayList<>();
4      int n = nums.length;
5      Arrays.sort(nums);
6      for(int i=0;i<n-2;i++)
7      {
8        if(i > 0 && nums[i] == nums[i-1]) 
9        {
10            continue;
11            }
12
13        if(nums[i]>0)
14        {
15            break;
16        }
17
18        int l = i+1;
19        int r = n-1;
20        while(l<r)
21        {
22            int sum = nums[i]+nums[l]+nums[r];
23            if(sum==0){
24                ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
25                while(l<r && nums[l]==nums[l+1]){
26                      l++;
27                }
28               
29                while(l<r && nums[r]==nums[r-1])
30                {
31                   r--;
32                }
33
34                r--;
35                l++;
36            }
37            else if(sum < 0)
38            {
39                      l++;
40            }
41else
42{
43r--;
44}        
45 }
46      }
47      return ans;
48    }
49}