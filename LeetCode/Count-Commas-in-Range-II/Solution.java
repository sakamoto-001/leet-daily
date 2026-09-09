1class Solution {
2    public long countCommas(long n) {
3      long ans = 0;
4      for(long i = 1000; i <= n; i *= 1000)
5      {
6        ans += n-i+1;
7      }
8      return ans;
9    }
10}