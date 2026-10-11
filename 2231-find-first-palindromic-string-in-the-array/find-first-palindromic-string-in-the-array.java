class Solution {
    public String firstPalindrome(String[] words) {
           String ans="";
        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            String rendu = "";
         
            int temp1 = temp.length();
            for (int j = temp1 - 1; j >= 0; j--) {
                rendu = rendu + temp.charAt(j);
            }
            if (temp.equals(rendu)) {
                ans= rendu ;
                break;
            }
        }

        return ans;
    }
}