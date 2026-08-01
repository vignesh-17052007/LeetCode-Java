class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
      int[][] val = new int[image.length][image[0].length];
      
      int a = image[0].length - 1;
       for(int i=0;i<image.length;i++){
          int k=0;
        for(int j=a;j>=0;j--){
            val[i][k]=image[i][j];
            k++;
        }
       }
       int [][] ans=new int[val.length][val[0].length];
       for(int i=0;i<val.length;i++){
        for(int j=0;j<val[i].length;j++){
            if(val[i][j]==0){
                ans[i][j]=1;
            }
             else{
                ans[i][j]=0;
            }
        }
       }
       return ans;
    }
}