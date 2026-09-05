1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3       Set <String> set = new HashSet <> (); 
4       for(int r = 0; r < 9; r++) {
5        for(int c = 0; c < 9; c++) {
6           char ch = board[r][c];
7           if(ch != '.')
8           {
9             if(!set.add(ch+"in row"+r) || !set.add(ch+"in col"+c) || 
10           !set.add(ch+"in box"+r/3 + "-"+ c/3))
11           {
12            return false;
13           }}}}
14       return true;
15    }
16}