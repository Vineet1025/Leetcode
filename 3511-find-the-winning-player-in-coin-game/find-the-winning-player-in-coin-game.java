class Solution {
    public String losingPlayer(int x, int y) {
        int min=Math.min(x, y/4);
        if(min%2==0){
           return "Bob";
        }
        return "Alice";
    }
}