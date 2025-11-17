class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st= new Stack<>();
        int a=0;
        int b=0;
        
        for(int i=0; i<tokens.length; i++){
              if(tokens[i].equals("+")){
                st.push(st.pop()+st.pop());
            } else if(tokens[i].equals("-")){
                a=st.pop();
                b=st.pop();
                st.push(b-a);
            } else if(tokens[i].equals("*")){
                st.push(st.pop()*st.pop());
            }else if(tokens[i].equals("/")){
                a=st.pop();
                b=st.pop();
                st.push(b/a);
            } else{
                st.push(Integer.parseInt(tokens[i]));
            }
          }
        return st.peek();
    }
}