class Solution {
    public int longestPalindrome(String s) {
        int[] charCount = new int[128];
        int palindromeLength = 0;
        for (char c:s.toCharArray()) {
            charCount[c]++;
            if (charCount[c]%2 == 0) {
                palindromeLength += 2;
            }
        }
        return (s.length() - palindromeLength) > 0 ? palindromeLength+1:palindromeLength;
    }
}