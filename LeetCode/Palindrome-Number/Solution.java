1class Solution {
2    public boolean isPalindrome(int x) {
3        if(x<0){
4            return false;
5        }
6        int n = x;
7        int rev=0;
8        while(x!=0)
9        {
10          rev = (rev*10)+(x%10);
11          x=x/10;
12        }
13        return rev == n;
14    }
15}