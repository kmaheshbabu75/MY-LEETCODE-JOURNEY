class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] degrees = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                degrees[i] += matrix[i][j];
            }
        }
        
        return degrees;
    }
}