class Solution {
    public int titleToNumber(String columnTitle) {
        String columnValue = new StringBuffer(columnTitle).reverse().toString();
        int i = 0;
        int result = 0;
        for (char c : columnValue.toCharArray()) {
            result += ((int)c % 65 + 1) * Math.pow(26, i);
            i++;
        }
        return result;
    }
}