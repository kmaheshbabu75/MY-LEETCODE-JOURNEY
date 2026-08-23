class Solution {
    public int maximumValue(String[] strs) {
        int maxVal = 0;
        
        for (String s : strs) {
            boolean isNumeric = true;
            for (char c : s.toCharArray()) {
                if (c < '0' || c > '9') {
                    isNumeric = false;
                    break;
                }
            }
            int val = isNumeric ? Integer.parseInt(s) : s.length();
            maxVal = Math.max(maxVal, val);
        }
        
        return maxVal;
    }
}