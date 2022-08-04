class Solution {
    public int romanToInt(String s) {
        char[] data = s.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int result = 0;
        for(int i=data.length-1;i>=0;i--) {
            int currentResult = map.get(data[i]);
            if (i>0 && currentResult > map.get(data[i-1])) {
                result += currentResult-map.get(data[i-1]);
                i--;
            } else {
                result += currentResult;
            }
        }
        return result;
    }
}