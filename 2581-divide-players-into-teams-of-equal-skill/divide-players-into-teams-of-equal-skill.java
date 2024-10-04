class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int target=skill[0]+skill[skill.length-1];
        long ans=0;
        for(int i=0; i<skill.length/2; i++){
            if(skill[i]+skill[skill.length-1-i]!=target){
                return -1;
            }else{
                ans+=skill[i]*skill[skill.length-1-i];
            }
        }
        return ans;
    }
}