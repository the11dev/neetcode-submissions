class MinStack {
    private Deque<int[]> st;
    public MinStack() {
        st= new ArrayDeque<>();
    }
    
    public void push(int val) {
        int min=val;
        if(!st.isEmpty())
            min=Math.min(val,st.peek()[1]);
        st.push(new int[]{val,min});
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek()[0];
    }
    
    public int getMin() {
        return st.peek()[1];
    }
}
