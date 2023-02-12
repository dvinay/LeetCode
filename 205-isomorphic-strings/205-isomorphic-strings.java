class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return s.length() != t.length();
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Map<Character, Character> mapStoT = new HashMap<Character, Character>();
        Map<Character, Character> mapTtoS = new HashMap<Character, Character>();

        for (int i=0;i<sChar.length;i++) {
            
            if (mapStoT.containsKey(sChar[i]) && 
                (mapStoT.get(sChar[i]) != tChar[i])) {
                return false;
            }
            if (mapTtoS.containsKey(tChar[i]) && 
                (mapTtoS.get(tChar[i]) != sChar[i])) {
                return false;
            }
            if (!mapStoT.containsKey(sChar[i])) {
                mapStoT.put(sChar[i], tChar[i]);
            } 
            if (!mapTtoS.containsKey(tChar[i])) {
                mapTtoS.put(tChar[i], sChar[i]);
            }
        }
        
        return true;
    }
}