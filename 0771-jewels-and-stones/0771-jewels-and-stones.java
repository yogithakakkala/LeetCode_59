class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] isjewels= new boolean[128];
        for(char ch : jewels.toCharArray() ){
            isjewels[ch]= true;
        }
        int count=0;
        for(char ch : stones.toCharArray()){
            if(isjewels[ch]){
                count++;
            }
        }
        return count;
        
    }
}