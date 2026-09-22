class Solution {
    public int[] concatWithReverse(int[] nums) {
    int val=nums.length+nums.length;
    int val_2=nums.length;
    int[] sol=new int[val];
    for(int i=0;i<nums.length;i++){
        sol[i]=nums[i];
    }
    for(int j=val_2;j<val;j++){
       sol[j]=nums[val_2-1];
       val_2--;
    }

    return sol;

        
    }
}