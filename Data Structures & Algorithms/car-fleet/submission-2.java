class Solution {
    public int carFleet(int target, int[] pos, int[] speed) {
        int n=pos.length;
        if(n==0 ) return 0;
        double[][] car = new double[n][2];
        for(int i=0;i<n;i++){
            car[i][0]=pos[i];
            car[i][1]=(double)(target-pos[i])/speed[i];
        }
        Arrays.sort(car,(a,b)-> Double.compare(a[0],b[0]));

        Stack<Double> st= new Stack<>();
        for(int i=n-1;i>=0;i--){
            double t=car[i][1];
            if(st.isEmpty() || t>st.peek()){
                st.push(t);
            }
        }
        return st.size();
    }
}
