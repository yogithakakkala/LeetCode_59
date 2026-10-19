class Solution {
    public int majorityElement(int[] nums) {
        int candidate =0;
        int votec=0;
        for (int i : nums){
            if (votec ==0){
                candidate = i;
            }
            if (candidate == i){
                votec++;
            }
            else{
                votec--;
            }
        }
        return candidate;
        
    }
}