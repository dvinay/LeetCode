class Solution {
    public String convertToTitle(int columnNumber) {
        char[] chars = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        StringBuffer ans = new StringBuffer();
        while (columnNumber > 0) {
            ans.append(chars[(columnNumber-1) % 26]);
            columnNumber = (columnNumber-1) / 26;
        }
        return ans.reverse().toString();
    }
}