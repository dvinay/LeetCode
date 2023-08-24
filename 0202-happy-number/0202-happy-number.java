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
        Set<Integer> temp = new HashSet<>();
        
        while (n != 1 && !temp.contains(n)) {
            temp.add(n);
            n = sumOfSquares(n);
            //System.out.println(n);
        }
        return n == 1;
    }
}