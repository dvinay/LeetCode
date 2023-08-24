class Solution {
    public boolean isHappy(int n) {
        Set<Integer> temp = new HashSet<>();
        int num = 0;
        while (n != 1 && !temp.contains(n)) {
            temp.add(n);
            num = n;
            n = 0;
            while (num != 0) {
                int digit = num % 10;
                num = num / 10;
                n += digit * digit;
            }
            //System.out.println(n);
        }
        return n == 1;
    }
}