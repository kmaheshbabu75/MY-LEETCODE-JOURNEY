class Solution {
    public String smallestPalindrome(String s) {
        // Step 1: Count character frequencies
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        
        StringBuilder leftHalf = new StringBuilder();
        String middle = "";
        
        // Step 2: Build the left half and find the middle character (if any)
        for (int i = 0; i < 26; i++) {
            if (counts[i] == 0) continue;
            
            // If the count is odd, this character goes in the middle
            if (counts[i] % 2 != 0) {
                middle = String.valueOf((char) (i + 'a'));
            }
            
            // Append half of the occurrences to the left half
            int halfCount = counts[i] / 2;
            for (int j = 0; j < halfCount; j++) {
                leftHalf.append((char) (i + 'a'));
            }
        }
        
        // Step 3: Combine left half, middle, and reversed left half
        String left = leftHalf.toString();
        String right = leftHalf.reverse().toString();
        
        return left + middle + right;
    }
}