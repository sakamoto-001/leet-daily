1class Solution {
2    public void rotate(int[][] matrix) {
3      int n = matrix.length;
4      for(int i = 0; i < n; i++){
5      for(int j = i+1; j < n; j++){
6         int temp = matrix[i][j];
7         matrix[i][j] = matrix[j][i];
8         matrix[j][i] = temp; }} 
9
10      for(int i = 0; i < n; i++){
11      for(int j = 0; j < n/2; j++){
12         int temp = matrix[i][j];
13         matrix[i][j] = matrix[i][n-1-j];
14         matrix[i][n-1-j] = temp;  }}
15    }
16}