1class Solution {
2    public int totalNumbers(int[] digits) {
3       int[] freq = new int [10];
4       for(int n : digits)
5       {
6        freq[n]++;
7       } 
8       int count = 0;
9       for(int i = 100; i < 1000; i = i+2)
10       {
11        int[] need = new int[10];
12         int temp = i;
13        need[temp%10]++;
14        temp/= 10;
15        need[temp%10]++;
16        temp/=10;
17        need[temp%10]++;
18        boolean check = true;
19        for(int k = 0; k < 10; k++)
20        {
21            if(need[k] > freq[k])
22            {
23                check = false;
24                break;
25            }
26        }
27         if(check)
28            {
29                count++;
30            }
31       }
32       return count;
33    }
34}