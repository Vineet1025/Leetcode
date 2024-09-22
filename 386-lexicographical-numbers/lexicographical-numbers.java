class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<String> list= new ArrayList<String>();
        for(int i=1; i<=n; i++){
            list.add(String.valueOf(i));
        }
        Collections.sort(list);
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int i=0; i<list.size(); i++){
            ans.add(Integer.valueOf(list.get(i)));
        }
        return ans;
    }
}