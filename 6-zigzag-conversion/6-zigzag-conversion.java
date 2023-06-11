class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        
        StringBuffer[] rows = new StringBuffer[numRows];
        StringBuffer result = new StringBuffer();
        
        int index = 0;
        
        // initialize the rows
        for (int row=0;row<numRows;row++) {
            rows[row] = new StringBuffer();
        }
        
        // Prepare each row with context
        while (index<s.length()) {
            //downward direction filling
            for (int row=0;row<numRows && index<s.length();row++) {
                rows[row].append(s.charAt(index++));
            }
            //upward direction filling
            for (int row=numRows-2;row>0 && index<s.length();row--) {
                rows[row].append(s.charAt(index++));
            }
        }
        
        for (int row=0;row<numRows;row++) {
            result.append(rows[row]);
        }
        return result.toString();
        
        /* 
        Mathematical approach: 
        Each horizontal positions = 2 * (number of rows - 1)
        Each Cross positions = 2 * (number of rows - 1) - 2 * current row
        Note: Each Cross positions computaiton not required for fist and last row.
        
        StringBuffer result = new StringBuffer();
        for (int row=0;row<numRows;row++) {
            int nextHorizontalPosition = (numRows-1)*2;
            for (int i=row;i<s.length();i=i+nextHorizontalPosition) {
                result.append(s.charAt(i));
                
                //next character position which is in-between the horizontal lines
                int nextCrossPosition = (i+nextHorizontalPosition)-(row*2);
                //next Cross Position is not require for first and last lines
                if (row > 0 && row < numRows - 1 
                    && nextCrossPosition > 0
                    && nextCrossPosition < s.length()) {
                    result.append(s.charAt(nextCrossPosition));
                }
                
            }
        }
        return result.toString();
        */
    }
}