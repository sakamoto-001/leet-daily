1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        List<Integer> row = new ArrayList<>();
4        long val = 1;
5        for(int i = 0; i <= rowIndex; i++)
6        {
7            row.add((int)val);
8            val = val*(rowIndex-i)/(i+1);
9        }
10        return row;
11    }
12}