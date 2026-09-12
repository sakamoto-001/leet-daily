1class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] ans = new int[n][n];
4        int top = 0, bottom = n-1;
5        int left = 0, right = n-1;
6        int num = 1;
7        while(top <= bottom && left <= right){
8        for(int i = left; i <= right; i++)
9         ans[top][i] = num++;
10         top++;
11         for(int j = top; j <= bottom; j++)
12         ans[j][right] = num++;
13         right--;
14         if(top <= bottom) {
15         for(int i = right; i >= left; i--)
16         ans[bottom][i] = num++;
17         bottom--;
18         }
19         if(left <= right){
20         for(int j = bottom; j >= top; j--)
21         ans[j][left] = num++;
22         left++;
23         }
24        }
25        return ans;
26    }
27}