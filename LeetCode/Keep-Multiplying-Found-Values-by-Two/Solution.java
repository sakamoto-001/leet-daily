1class Solution {
2    public int findFinalValue(int[] nums, int original) {
3        Set <Integer> set = new HashSet<>();
4       for(int i : nums)
5       {
6         set.add(i);
7       } 
8       while(set.contains(original))
9         {
10            original *= 2;
11         }
12       return original;
13    }
14}