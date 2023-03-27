class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        
        char[] data = s.toCharArray();
        boolean isSignExists = data[0] == '-' || data[0] == '+';
        boolean isNegativeNumber = data[0] == '-';
        boolean isLeadingCharacters = false;
        long result = 0;
        int i = isSignExists ? 1 : 0;
        
        for (; i<data.length && !isLeadingCharacters ; i++) {
            if ((int)data[i]>=48 && (int)data[i]<=57) {
                if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE){
                    break;
                }
                result = result*10 + ((int)data[i]-48);
            } else {
                isLeadingCharacters = true;
            }
        }
        
        result = isNegativeNumber ? -result : result;
        
        if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE){
            return result < Integer.MIN_VALUE ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        
        return (int)result;
    }
}