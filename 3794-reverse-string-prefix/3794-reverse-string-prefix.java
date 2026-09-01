class Solution {
    public String reversePrefix(String s, int k) {
        // if (k <= 1) {
        //     return s;
        // }
        // char[] chars = s.toCharArray();
        // int left = 0;
        // int right = k - 1;
        // while (left < right) {
        //     char temp = chars[left];
        //     chars[left] = chars[right];
        //     chars[right] = temp;
        //     left++;
        //     right--;
        // }
        
        // return new String(chars);
        if (k <= 1) {
            return s;
        }
        
        StringBuilder prefix = new StringBuilder(s.substring(0, k)).reverse();
        return prefix.append(s.substring(k)).toString();
    }
}