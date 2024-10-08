class Solution {
    public int minSwaps(String s) {
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[') 
                len++;
            else if (len > 0) 
                len--;
        }
        return (len + 1) / 2;
    }
}