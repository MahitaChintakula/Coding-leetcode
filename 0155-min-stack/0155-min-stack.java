class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> MinStack;
    public MinStack() {
        stack=new Stack<>();
        MinStack=new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);
        if(MinStack.isEmpty() || value <= MinStack.peek()){
            MinStack.push(value);
        }
        else{
            MinStack.push(MinStack.peek());
        }
    }
    
    public void pop() {
        stack.pop();
        MinStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return MinStack.peek();
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