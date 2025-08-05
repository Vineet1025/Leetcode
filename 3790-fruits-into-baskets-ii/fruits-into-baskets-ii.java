class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i:baskets){
            arr.add(i);
        }

        for(int i=0; i<fruits.length; i++){
            for(int j=0; j<arr.size(); j++){
                if(arr.get(j)>=fruits[i]){
                    arr.remove(j);
                    break;
                }
            }
        }
        return arr.size();

    }
}