class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Deque<Integer> st= new ArrayDeque<>();
        int[] res= new int[temp.length];
        for(int i=0;i<temp.length;i++){
            while(!st.isEmpty() && temp[i]>temp[st.peek()]){
                int prev=st.pop();
                res[prev]=i-prev;
            }
            st.push(i);
        }
        return res;
    }
}
