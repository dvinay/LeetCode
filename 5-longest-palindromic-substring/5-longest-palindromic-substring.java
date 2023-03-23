class Solution {
    
    private boolean isWithInRange(int index,int n) {
        return index>=0 && index<n;
    }
    
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) {
            return s;
        }
        
        char[] input = s.toCharArray();
        String maxPalindrome = String.valueOf(input[0]) ;
        
        //odd Palindrome
        for(int i=0;i<input.length;i++) {
            int j = 1;
            while (isWithInRange(i-j,input.length) && 
                   isWithInRange(i+j,input.length) && 
                   input[i-j] == input[i+j]) {
                j++;
            }
            if (j > 1) {
                j--;
                String currentPalindrome = s.substring(i-j,i+j+1);
                if (currentPalindrome.length() > maxPalindrome.length()) {
                    maxPalindrome = currentPalindrome;
                }
            }
        }
        
        //even Palindrome
        for(int i=0;i<input.length;i++) {
            int j = 0;
            while (isWithInRange(i-j,input.length) && 
                   isWithInRange(i+j+1,input.length) && 
                   input[i-j] == input[i+j+1]) {
                j++;
            }
            if (j > 0) {
                j--;
                String currentPalindrome = s.substring(i-j,i+j+2);
                if (currentPalindrome.length() > maxPalindrome.length()) {
                    maxPalindrome = currentPalindrome;
                }
            }
        }
        
        return maxPalindrome.toString();
    }
}