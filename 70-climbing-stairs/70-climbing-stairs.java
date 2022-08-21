class Solution {
    int[] data;
    
    public int climbStairs(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        
        data = new int[n+1];
        data[0] = 0;
        data[1] = 1;
        data[2] = 2;
        return getclimbStairs(n);
    }
    
    public int getclimbStairs(int n) {
        if (n == 1 || n == 2 || data[n] != 0) {
            return data[n];
        } else {
            data[n] = getclimbStairs(n-1) + getclimbStairs(n-2);
            return data[n];
        }
        
        
    }
}