class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x) {
                    count++;
                    break;      
                }
            }
            if (count >= 1) {
                ans.add(i);
            }
        }
        return ans;
    }
}