class Solution {
    public String reverseVowels(String s) {
        String VOWELS = "aeiouAEIOU";
        boolean[] vowelsIdxs = new boolean[126];

        for (char c : VOWELS.toCharArray()) {
            vowelsIdxs[c] = true;
        }

        char[] strArr = s.toCharArray();

        int l = 0;
        int r = strArr.length - 1;

        while (l < r) {

            while (l < r && !vowelsIdxs[strArr[l]]) {
                l++;
            }

            while (l < r && !vowelsIdxs[strArr[r]]) {
                r--;
            }

            if (l < r) {
                char temp = strArr[l];
                strArr[l] = strArr[r];
                strArr[r] = temp;
                l++;
                r--;
            }
        }

        return new String(strArr);

    }
}