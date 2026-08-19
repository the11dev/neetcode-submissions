class Solution {
    public String simplifyPath(String path) {
        String[]comp = path.split("/");
        Stack<String> st= new Stack<>();
        for(String c:comp){
            if(c.isEmpty() || c.equals(".")){
                continue;
            }else if(c.equals("..")){
                if(!st.isEmpty()) st.pop();
            }else{
                st.push(c);
            }
        }
        if(st.isEmpty()) return "/";
        StringBuilder sb = new StringBuilder();
        for(String s:st){
            sb.append("/").append(s);
        }
        return sb.toString();
    }
}