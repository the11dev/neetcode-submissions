class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> st= new ArrayDeque<>();
        for(int i:asteroids){
            boolean destroy=false;
            while( !st.isEmpty() && st.peek()>0 && i<0){
                if(st.peek()<-i){
                    st.pop();
                    continue;
                }else if(st.peek()==-i){
                    st.pop();
                    destroy=true;
                    break;
                }else{
                    destroy=true;
                    break;
                }
            }
            if(!destroy) st.push(i);
        }
        int[] res = new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
}