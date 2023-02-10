class Solution {
    public boolean isSubsequence(String s, String t) {
        
        char[] tChar = t.toCharArray();
        char[] sChar = s.toCharArray();
        int tIdx=0, sIdx=0;
        
        while (tIdx<t.length() && sIdx<s.length()) {
            if (tChar[tIdx] == sChar[sIdx]) {
                sIdx++;
            }
            tIdx++;
        }
        return (sIdx == s.length());
    }
}