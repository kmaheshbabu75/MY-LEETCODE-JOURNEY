class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder(words.length);
        
        for (String word : words) {
            int currentWeight = 0;
            
            for (char c : word.toCharArray()) {
                currentWeight += weights[c - 'a'];
            }
            
            int mod = currentWeight % 26;
            char mappedChar = (char) ('z' - mod);
            
            result.append(mappedChar);
        }
        
        return result.toString();
    }
}