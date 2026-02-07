class Solution {
    public int minimumDeletions(String s) {
        int delete=0;
        int bcount =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)== 'b'){
                bcount++;
            }else{
                if(bcount >0){
                    delete++;
                    bcount--;
                }
            }
        }
        return delete;
    }
}