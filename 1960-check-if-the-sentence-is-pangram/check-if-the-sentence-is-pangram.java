class Solution {
    public boolean checkIfPangram(String sentence) {

        boolean[] seen = new boolean[26];
        int sum = 0;

        // Remove duplicates
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (!seen[ch - 'a']) {
                seen[ch - 'a'] = true;
                sum += ch;   // Add ASCII value
            }
        }

        return sum == 2847;
    }
}