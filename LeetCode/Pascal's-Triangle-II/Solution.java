1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        List<Integer> row = new ArrayList<>();
4        row.add(1);
5        for(int i = 1; i <= rowIndex; i++)
6        {
7            row.add(1);
8            for(int j = i-1; j > 0; j--)
9            {
10                row.set(j,row.get(j)+row.get(j-1));
11            }
12        }
13        return row;
14    }
15}