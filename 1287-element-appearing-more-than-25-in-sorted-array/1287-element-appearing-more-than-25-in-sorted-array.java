class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int element = n/4;

        for (int i = 0; i < n - element; i++) {
            if (arr[i] == arr[i + element]) {
                return arr[i];
            }
        }
        return -1;
    }
}