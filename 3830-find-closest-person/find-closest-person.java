class Solution {
    public int findClosest(int x, int y, int z) {
        int a=0;
        int b=0;
        if(x>z){  
          a = x-z;
        }else{
           a = z-x; 
        }

        if(y>z){  
          b= y-z;
        }else{
          b= z-y;
        }
        
        if(a<b){
           return 1;
        }else if(a>b){
            return 2;
        }
        
        return 0;
    }
}