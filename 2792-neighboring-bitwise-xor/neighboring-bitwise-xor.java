class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int a=0;
        for(int i=0; i<derived.length; i++){
               a^=derived[i];
        }
        if(a==0){
            return true;
        }
        return false;
    }
}