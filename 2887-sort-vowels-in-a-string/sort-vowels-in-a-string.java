class Solution {
    public String sortVowels(String s) {
        char ch[]=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        char temp[]=new char[ch.length];
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
               sb.append(ch[i]);
            }
            else if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
               sb.append(ch[i]);
            
            }
            else{
                temp[i]=ch[i];
            }
        }
       
        char c[]=sb.toString().toCharArray();
        Arrays.sort(c);
        int j=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                temp[i]=c[j];
                j++;
            }
            else if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                temp[i]=c[j];
                j++;
            }
        }
        String ans="";
        for(int i=0;i<temp.length;i++){
            ans+=temp[i];
        }
        return ans;
    }
}