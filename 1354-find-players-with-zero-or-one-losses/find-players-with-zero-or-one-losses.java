class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] match : matches){
            int winner = match[0];
            int loser = match[1];
            if(map.containsKey(loser)){
                map.put(loser, map.get(loser) + 1);
            }
            if(!map.containsKey(winner)){
                map.put(winner, 0);
            }
            if(!map.containsKey(loser)){
                map.put(loser, 1);
            }
        }

        ArrayList<Integer> winners = new ArrayList<>();
        ArrayList<Integer> losers = new ArrayList<>();
        map.forEach((key, value) -> {
            if(value == 0){
                winners.add(key);
            }
            if(value == 1){
                losers.add(key);
            }
        });

        Collections.sort(winners);
        Collections.sort(losers);

        ans.add(winners);
        ans.add(losers);
        return ans;
    }
}