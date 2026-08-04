class Solution {
    public int lengthOfLastWord(String s) {
       String[] val = s.trim().split("\\s+");
       String ans=val[val.length-1];
       int count=0;
       for(int i=0;i<ans.length();i++){
           count++;
       }
       return count;
        
     }
}