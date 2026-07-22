class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxRowIndex = 0;
        int maxOnesCount = 0;

        for (int i = 0; i < mat.length; i++) {
            int currentRowOnes = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    currentRowOnes++;
                }
            }
            if (currentRowOnes > maxOnesCount) {
                maxOnesCount = currentRowOnes;
                maxRowIndex = i;
            }
        }

        return new int[]{maxRowIndex, maxOnesCount};
    }
}