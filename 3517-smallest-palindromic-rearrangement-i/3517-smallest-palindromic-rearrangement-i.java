class Solution {
    public String smallestPalindrome(String s) {
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        
        StringBuilder leftHalf = new StringBuilder();
        String middle = "";
        
        for (int i = 0; i < 26; i++) {
            if (counts[i] == 0) continue;
            
            if (counts[i] % 2 != 0) {
                middle = String.valueOf((char) (i + 'a'));
            }
            
            int halfCount = counts[i] / 2;
            for (int j = 0; j < halfCount; j++) {
                leftHalf.append((char) (i + 'a'));
            }
        }
        
        String left = leftHalf.toString();
        String right = leftHalf.reverse().toString();
        
        return left + middle + right;
    }
}