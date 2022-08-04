class Solution {
    public boolean isPalindrome(int x) {
        if (x >= 0 && x <= 9) {
            return true;
        }
        if (x < 0) {
            return false;
        }
        
        int temp = x, result = 0;
        while(temp != 0) {
            int digit = temp % 10;
            result = result*10 + digit;
            temp = temp / 10;
        }
        
        return (result == x);
    }
}