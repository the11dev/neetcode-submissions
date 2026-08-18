class Solution {
    public int calPoints(String[] ops) {
        Deque<Integer> st= new ArrayDeque<>();
        for(String s:ops){
            if(s.equals("C")){
                st.pop();
            }else if(s.equals("D")){
                st.push(2*st.peek());
            }else if(s.equals("+")){
                int b=st.pop();
                int a=st.peek();
                st.push(b);
                st.push(a+b);
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        for(int i:st){
            sum+=i;
        }
        return sum;
    }
}