class Solution {
    public boolean isValid(String s) {
        int m=s.length();
        Stack<Character> st=new Stack<>();

        for(int i=0;i<m;i++){
            char ch=s.charAt(i);
            if(st.size()==0 && (ch=='b' || ch=='c'))
            return false;

            if(ch=='a' || ch=='b')
            st.push(ch);

            else{
                if(st.size()>1){
                    char ch1=st.pop();
                    char ch2=st.pop();
                    if(ch1!='b'|| ch2!='a')
                    return false;
                }
                else
                return false;
            }
        }
        if(st.size()>0)
        return false;

        return true;
    }
}