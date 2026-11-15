class MinStack {

    private Deque<Integer> valstack;
    private Deque<Integer> minstack;
    
    public MinStack() {
        valstack=new ArrayDeque<>();
        minstack=new ArrayDeque<>();
    }
    
    public void push(int value) {
        valstack.push(value);
        int min = minstack.isEmpty()?value:Math.min(value,minstack.peek());
        minstack.push(min);   
    }
    
    public void pop() {
        minstack.pop();
        valstack.pop();
    }
    
    public int top() {
        return valstack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */