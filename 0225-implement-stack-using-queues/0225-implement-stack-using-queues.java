class MyStack {
    List<Integer> queue1 = null;
    List<Integer> queue2 = null;
    public MyStack() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        queue1.add(x);
    }
    
    public int pop() {
        return move(true);
    }
    
    public int top() {
        return move(false);
    }
    
    private int move(boolean isRemoveOperation) {
        // move queue1 data to queue2
        Integer topElement = null;
        for (int i=0;i<queue1.size();i++) {
            topElement = queue1.get(i);
            queue2.add(topElement);
        }
        queue1 = new LinkedList<Integer>();
        int length = isRemoveOperation ? queue2.size()-1 : queue2.size();
        for (int i=0;i<length;i++) {
            queue1.add(queue2.get(i));
        }
        queue2 = new LinkedList<Integer>();
        return topElement;
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */