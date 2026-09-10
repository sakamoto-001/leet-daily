1class Solution {
2    public int[] plusOne(int[] digits) {
3        int n = digits.length;
4   for(int i=n-1; i>=0;i--)
5   {
6    if(digits[i]<9)
7    {
8        digits[i]+=1;
9        return digits;
10    }
11    digits[i]=0;
12   } 
13    int[]out = new int[n+1];
14    out[0]=1;
15   return out;  
16     }
17}