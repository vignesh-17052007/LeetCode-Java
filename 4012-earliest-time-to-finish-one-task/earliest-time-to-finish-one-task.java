class Solution {
    public int earliestTime(int[][] tasks) {
      int sum = Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++){
            int temp=0;
            for(int j=0;j<tasks[i].length;j++){
               temp+=tasks[i][j];
            }
            if(temp<sum){
                sum=temp;
            }
        }
        return sum;
    }
}