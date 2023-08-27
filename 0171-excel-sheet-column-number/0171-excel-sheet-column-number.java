class Solution {
    public int titleToNumber(String columnTitle) {
        
        int result = 0;
        
        for (int i = columnTitle.length()-1, j=0 ; i>=0; i--) {
            result += ((int)columnTitle.charAt(i) - 65 + 1) * Math.pow(26, j);
            j++;
        }
        return result;
    }
}