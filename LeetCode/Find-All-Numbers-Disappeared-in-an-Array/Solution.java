1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        for(int i = 0; i < nums.length; i++)
4        {
5            int idx = Math.abs(nums[i])-1;
6            nums[idx] = -Math.abs(nums[idx]);
7        }
8        ArrayList<Integer>ans = new ArrayList<>();
9        for(int i = 0; i < nums.length; i++)
10        {
11            if(nums[i] > 0)
12            {
13                ans.add(i+1);
14            }
15        }
16        return ans;
17    }
18}