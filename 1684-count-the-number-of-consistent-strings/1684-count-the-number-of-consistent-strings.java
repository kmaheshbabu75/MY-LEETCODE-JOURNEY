class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int allowedMask = 0;
        
        for (char c : allowed.toCharArray()) {
            allowedMask |= (1 << (c - 'a'));
        }
        
        int consistentCount = 0;
        
        for (String word : words) {
            boolean isConsistent = true;
            for (char c : word.toCharArray()) {

                if ((allowedMask & (1 << (c - 'a'))) == 0) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                consistentCount++;
            }
        }
        
        return consistentCount;
    }
}