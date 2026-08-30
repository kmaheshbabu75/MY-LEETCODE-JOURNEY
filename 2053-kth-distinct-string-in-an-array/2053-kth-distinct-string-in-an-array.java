class Solution {
    public String kthDistinct(String[] arr, int k) {
        java.util.Map<String, Integer> counts = new java.util.HashMap<>();
        
        for (String s : arr) {
            counts.put(s, counts.getOrDefault(s, 0) + 1);
        }
        for (String s : arr) {
            if (counts.get(s) == 1) {
                k--;
                if (k == 0) {
                    return s;
                }
            }
        }
        
        return "";
    }
}