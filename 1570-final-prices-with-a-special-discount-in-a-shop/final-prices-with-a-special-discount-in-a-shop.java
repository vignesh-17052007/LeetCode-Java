class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            int count=0;
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                    ans[i]=prices[i]-prices[j];
                    count++;
                    break;
                }

            }
            if(count==0){
                ans[i]=prices[i];
            } 

        }
        return ans;
    }
}