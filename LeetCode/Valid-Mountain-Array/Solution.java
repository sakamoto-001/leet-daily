1class Solution {
2    public boolean validMountainArray(int[] arr) {
3        int i = 0,n = arr.length;
4        while(i+1 < n && arr[i] < arr[i+1]){
5        i++;
6        }
7        if(i == 0 || i == n-1){
8        return false;
9        }
10        while(i+1 < n && arr[i] > arr[i+1]){
11        i++;
12        }
13        return i == n-1;
14    }
15}