class Solution {
    public String reversePrefix(String word, char ch) {

        String prefix = "";
        String suffix = "";
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            prefix += word.charAt(i);
            if (word.charAt(i) == ch) {
                found = true;
                for (int j = i + 1; j < word.length(); j++) {
                    suffix += word.charAt(j);
                }
                break;
            }
        }
        if (!found) {
            return word;
        }
        String reverse = "";

        for (int i = prefix.length() - 1; i >= 0; i--) {
            reverse += prefix.charAt(i);
        }

        return reverse + suffix;
    }
}