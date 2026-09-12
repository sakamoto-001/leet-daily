1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3       List<Integer> ans = new ArrayList<>(); 
4       if(matrix == null || matrix.length == 0)return ans;
5       int top = 0, bottom = matrix.length-1;
6       int left = 0, right = matrix[0].length-1;
7       while(top <= bottom && right >= left)
8       {
9           for(int i = left; i <= right; i++)
10           {
11             ans.add(matrix[top][i]);
12           } top++;
13           for(int j = top; j <= bottom; j++)
14           {
15            ans.add(matrix[j][right]);
16           } right--;
17           if(top <= bottom)
18           {
19            for(int i = right; i >= left; i--)
20                ans.add(matrix[bottom][i]);
21                bottom--;
22           }
23           if(left <= right){
24            for(int j = bottom; j >= top; j--)
25                ans.add(matrix[j][left]);
26                left++;
27           }
28       }
29return ans;
30    }
31}