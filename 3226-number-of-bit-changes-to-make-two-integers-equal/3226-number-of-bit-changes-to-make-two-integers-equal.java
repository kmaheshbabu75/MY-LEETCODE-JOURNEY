class Solution {
    public int minChanges(int n, int k) {
        int changes = 0;  
        while (n > 0 || k > 0) {
            int bitN = n & 1;
            int bitK = k & 1;
            
            if (bitN != bitK) {
                if (bitN == 0) return -1;
                changes++;
            }
            n >>= 1;
            k >>= 1;
        }
        return changes;
    }
}