class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int current = 0;

        for(int i = 0; i < s.length(); i++){
            char character = s.charAt(i);

            if(character == '('){
                current++;
                if (current > max) {
                    max = current;
                }


            }else if (character == ')') {
                current--;
            }
        }
        return max;

    }
}