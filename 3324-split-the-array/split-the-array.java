class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        if(nums.length%2==1){
            return false;
        }
        Arrays.sort(nums);
        int []ans =new int[nums.length/2];
        int []ans_1 =new int[nums.length/2];
        int k=0;
        int l=0;
        for(int i=0;i<nums.length;i+=2){
            ans[k]=nums[i];
            k++;
        }
        for(int j=1;j<nums.length;j+=2){
            ans_1[l]=nums[j];
            l++;
        }
        for (int i = 1; i < l; i++) {
            if (ans_1[i] == ans_1[i - 1]) {
                return false;
            }
        }
         for (int i = 1; i < k; i++) {
            if (ans[i] == ans[i - 1]) {
                return false;
            }
        }
         return true;

    }
}