class Solution {
    private int sumOfSquares(int n) {
        int result = 0;
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            result += digit * digit;
        }
        return result;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        
        do{
            slow=sumOfSquares(slow);
            fast=sumOfSquares(sumOfSquares(fast));
        } while(slow!=fast);
        
        return slow == 1;
        
        /* Using HashSet to find the duplicate/loop
        Set<Integer> temp = new HashSet<>();
        
        while (n != 1 && !temp.contains(n)) {
            temp.add(n);
            n = sumOfSquares(n);
        }
        return n == 1;
        */
    }
}