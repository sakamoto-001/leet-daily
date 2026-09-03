1class Solution {
2    public int[][] transpose(int[][] matrix) {
3      int r = matrix.length;
4      int c = matrix[0].length;
5      int [][] ans = new int [c][r];
6      for(int i = 0; i < r; i++)
7      {
8        for(int j = 0; j < c; j++)
9        {
10           ans[j][i]=matrix[i][j];
11        }
12      }
13      return ans;
14    }
15}