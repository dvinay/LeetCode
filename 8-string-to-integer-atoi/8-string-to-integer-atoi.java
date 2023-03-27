class Solution {
    public int myAtoi(String s) {
        // trim the trailing spaces
        s = s.trim();
        // edge case where length of the string is 0
        if(s.length() == 0) return 0;
        // store the answer in long as it can go out of integer bounds
        long ans = 0;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            // case of '+' & '-' at index 0
            if(i == 0 && (ch == '-' || ch == '+')){
                continue;
            } else if(ch > '9' || ch < '0'){ // not an integer
                break;
            } else if(ch == ' '){ // case of white space
                continue;
            } else{
                // if ans is out of bounds then break
                if(ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE){
                    break;
                }
                // else adding to the answer
                ans = (ans*10) + (ch - '0');
            }
        }

        // changing to negative if needed
        if(s.charAt(0) == '-'){
            ans = -ans; 
        }
        // handling the out of bounds case
        if(ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE){
            return ans < Integer.MIN_VALUE ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        // convert and return the answer
        return (int) ans;
    }
}