class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        
        StringBuffer result = new StringBuffer();
        for (int i=0;i<numRows;i++) {
            int nextPosition = (numRows-1)*2;
            for (int j=i;j<s.length();j=j+nextPosition) {
                result.append(s.charAt(j));
                
                //todo: in between lines
                int midPosition = j+nextPosition-i*2;
                if (i > 0 && i < numRows - 1 
                    && midPosition > 0
                    && midPosition < s.length()) {
                    result.append(s.charAt(midPosition));
                }
                
            }
        }
        return result.toString();
    }
}