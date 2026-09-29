class Solution {
    public int countSeniors(String[] details) {
        int count =0;
        for(int i=0;i<details.length;i++){  
         String temp=details[i];   
         char ch = temp.charAt(12);
         int num = Integer.parseInt(temp.substring(11,13));
            if(num>60)
            count++;
        }
        return count;
    }
}