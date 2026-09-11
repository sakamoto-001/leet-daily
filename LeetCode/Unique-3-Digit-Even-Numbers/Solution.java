1class Solution {
2    public int totalNumbers(int[] digits) {
3       int[] freq = new int [10];
4       for(int n : digits){
5        freq[n]++; } 
6       int count = 0;
7       for(int i = 100; i < 1000; i = i+2)
8       {
9        int a = i/100;
10        int b = (i/10)%10;
11        int c = i%10;
12        if(freq[a]==0 || freq[b]==0 || freq[c]==0)continue;
13            if(a==b && b==c)
14            {
15                if(freq[a]<3)continue;
16            }
17            else if(a==b || a==c)
18            {
19              if(freq[a]<2)continue;
20            }
21            else if(b==c)
22            {
23                if(freq[b]<2)continue;
24            }
25            count++;
26       }
27       return count;
28    }
29}