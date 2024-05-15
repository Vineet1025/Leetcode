class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int a = 0;

        
        if(flowerbed.length == 1){
            if(flowerbed[0] != 1){
                a++;
            }
            if(a == n || a > n){
                return true;
            } 
            else{
                return false;
            }
        }


        if(flowerbed[1] != 1 && flowerbed[0] != 1){
            a++;
            flowerbed[0] = 1;
        }

        
        for(int i = 1; i < flowerbed.length - 1; i++){
            
            if(flowerbed[i - 1] != 1 && flowerbed[i + 1] != 1 && flowerbed[i] != 1){
                a++;
                flowerbed[i] = 1;
            }
        }


        if(flowerbed[flowerbed.length - 1] != 1 && flowerbed[flowerbed.length - 2] != 1){
            a++;
            flowerbed[flowerbed.length - 1] = 1;
        }


        if(a == n || a > n){
            return true;
        }
        else{
            return false;
        }
    }
}