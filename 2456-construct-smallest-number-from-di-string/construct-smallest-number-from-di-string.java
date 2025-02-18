class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int number = 1;
        for(char ch : pattern.toCharArray())
        {
            stack.push(number);
            number++;
            if(ch == 'I')
            {
                while(!stack.isEmpty())
                    result.append(stack.pop());
            }
        }

        stack.push(number);

        while(!stack.isEmpty())
            result.append(stack.pop());

        return result.toString();
    }
}