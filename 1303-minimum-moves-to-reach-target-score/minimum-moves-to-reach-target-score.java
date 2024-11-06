class Solution {
    public int minMoves(int target, int maxDoubles) {
        
        int moves = 0;

        while(target > 1 && maxDoubles > 0){

            if(target % 2 == 1) target -= 1;
            else {
                target /= 2;
                maxDoubles--;
            }
            moves++;
        }
        return target == 1 ? moves : moves + (target - 1);
    }
}