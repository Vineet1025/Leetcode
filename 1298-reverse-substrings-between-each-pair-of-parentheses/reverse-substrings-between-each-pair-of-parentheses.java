class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                while (st.peek() != '(') {
                    sb.append(st.pop());
                }
                st.pop();
                while (sb.length() > 0) {
                    st.push(sb.charAt(0));
                    sb.deleteCharAt(0);
                }
            } else {
                st.push(s.charAt(i));
            }
        }
        while (!st.isEmpty()) {
            sb.insert(0, st.pop());
        }

        return sb.toString();
    }
}