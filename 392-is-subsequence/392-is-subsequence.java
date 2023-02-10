class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean result = false;
        if (s.length() > t.length()) {
            return result;
        }
        if (s.length() == 0 || (t.length() == 0 && s.length() == 0)) {
            return true;
        }
        
        char[] tChar = t.toCharArray();
        char[] sChar = s.toCharArray();
        int tIdx=0, sIdx=0;
        
        for (tIdx=0;tIdx<t.length();tIdx++) {
            if (sIdx<s.length() && tChar[tIdx] == sChar[sIdx]) {
                sIdx++;
            }
        }
        if (sIdx == s.length()) {
            result = true;
        }
        return result;
    }
}