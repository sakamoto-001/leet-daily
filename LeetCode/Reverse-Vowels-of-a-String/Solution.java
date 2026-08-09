1class Solution {
2    public String reverseVowels(String s) {
3        StringBuilder str = new StringBuilder(s);
4        int left = 0;
5           int right = str.length()- 1;
6        while(left<right)
7        { 
8             if (!isVowel(str.charAt(left))) {
9                left++;
10            }
11            else if (!isVowel(str.charAt(right))) {
12                right--;
13            }
14            else
15            {
16             char first = str.charAt(left);
17           char last = str.charAt(right);
18
19          str.setCharAt(left,last);
20          str.setCharAt(right,first);
21          left++;
22          right--;
23            }
24        }
25        return str.toString();
26    }
27      public boolean isVowel(char c) {
28        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
29               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
30      }
31}