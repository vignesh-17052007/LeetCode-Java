class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        String vicky = "";
        for (int i = 0; i < k; i++) {
            if (i == 0) {
                vicky += arr[i];
            } else {
                vicky += " " + arr[i];
            }
        }
        return vicky;
    }
}