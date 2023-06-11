class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineCharCount = new HashMap<>();
        for (char c:magazine.toCharArray()) {
            magazineCharCount.put(c, magazineCharCount.getOrDefault(c, 0)+1);
        }
        for (char c:ransomNote.toCharArray()) {
            if (magazineCharCount.containsKey(c) && magazineCharCount.get(c) > 0) {
                magazineCharCount.put(c, magazineCharCount.get(c)-1);
            } else {
                return false;
            }
        }
        return true;
    }
}