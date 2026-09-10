1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3      List<List<Integer>>ans = new ArrayList<>();
4      ans.add(new ArrayList<>());
5      ans.get(0).add(1);
6      for(int row = 1; row < numRows; row++)
7      {
8        List<Integer>preRow = ans.get(row-1);
9        List<Integer>newRow = new ArrayList<>();
10        newRow.add(1);
11        for(int i = 1; i < row; i++)
12        {
13            newRow.add(preRow.get(i)+preRow.get(i-1));
14        }
15        newRow.add(1);
16        ans.add(newRow);
17      }
18      return ans;
19    }
20}