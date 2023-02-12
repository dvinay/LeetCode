class Solution {
    public int longestPalindrome(String s) {
        int[] charCount = new int[123];
        int palindromeLength = 0; // number of even characters + one odd character(optional)
        
        for (char c:s.toCharArray()) {
            charCount[c]++; // count of number of chanracters
            if (charCount[c]%2 == 0) {
                palindromeLength += 2;
            }
        }
        return (s.length() - palindromeLength) > 0 ? palindromeLength+1:palindromeLength;
    }
}