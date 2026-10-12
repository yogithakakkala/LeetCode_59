class Solution {
    public int mostWordsFound(String[] sentences) {
        int m=0;
        for (String s:sentences){
            int word=1;
            for (char c:s.toCharArray()){
                if(c==' '){
                    word++;
                }
               
            } m=Math.max(m,word);
        }
        return m;
    }
}