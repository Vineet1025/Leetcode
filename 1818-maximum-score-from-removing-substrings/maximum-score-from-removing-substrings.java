class Solution {
    public int maximumGain(String s, int x, int y) {
        int max=0;
        Stack<Character> stack=new Stack<>();
        if (x >= y) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (stack.isEmpty()) {
                    stack.push(c);
                } else {
                    if (stack.peek() == 'a' && c == 'b') {
                        max += x;
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            String t = sb.reverse().toString();
            stack.clear();
            for (int i = 0; i < t.length(); i++) {
                char c = t.charAt(i);
                if (stack.isEmpty()) {
                    stack.push(c);
                } else {
                    if (stack.peek() == 'b' && c == 'a') {
                        max += y;
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            return max;
        } else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (stack.isEmpty()) {
                    stack.push(c);
                } else {
                    if (stack.peek() == 'b' && c == 'a') {
                        max += y;
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            String t = sb.reverse().toString();
            stack.clear();
            for (int i = 0; i < t.length(); i++) {
                char c = t.charAt(i);
                if (stack.isEmpty()) {
                    stack.push(c);
                } else {
                    if (stack.peek() == 'a' && c == 'b') {
                        max += x;
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            return max;
    }
}
}