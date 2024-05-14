class Solution {
    public String removeOuterParentheses(String s) {
        if(s=="")
        return s;
        int x=0;
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
           if(s.charAt(i) == '('){
            if(x>0)
                sb.append("(");
                x++;
            
           }
            else if(s.charAt(i) == ')'){
            x--;
            if(x>0)
            sb.append(")");

           }
        
        }
        return sb.toString();


    }
}
    