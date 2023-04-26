public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        for (int i=0;i<32/2;i++) {
            //find the bit and they are differen then swap
            if (getBit(n,i) != getBit(n,32-1-i)) {
                int mask = (1 << i) | (1 << 32-1-i);        
                n = n ^ mask;
            }
        }
        return n;
    }
    
    private int getBit(int n, int position) {
        return (n>>position & 1);
    }
}