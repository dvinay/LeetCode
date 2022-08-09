class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char data : s.toCharArray()) {
            if (data == '(' || data == '{' || data == '[') {
                stack.push(data);
            } else if (data == ')' && !stack.empty() && stack.peek() == '(') {
                stack.pop();
            } else if (data == '}' && !stack.empty() && stack.peek() == '{') {
                stack.pop();
            } else if (data == ']' && !stack.empty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}