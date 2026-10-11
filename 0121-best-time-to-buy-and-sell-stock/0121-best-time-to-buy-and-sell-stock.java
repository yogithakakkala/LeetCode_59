class Solution {
    public int maxProfit(int[] prices) {
        int min_p= prices[0];
        int max_p=0;
        for(int i : prices){
            min_p=Math.min(min_p,i);
            max_p=Math.max(max_p,i-min_p);
            }
        return max_p;

        }
    }
