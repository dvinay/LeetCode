class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> characterCount = new LinkedHashMap<Character, Integer>();
        char[] data = s.toCharArray();
        for (char c : data) {
            if (!characterCount.containsKey(c)) {
                characterCount.put(c, 1);
            } else {
                characterCount.put(c, characterCount.get(c)+1);
            }
        }
        for (int i = 0; i < data.length ; i++) {
            if (characterCount.get(data[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}