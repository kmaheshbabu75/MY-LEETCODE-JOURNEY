// class Solution {
//     public long removeZeros(long n) {
//         long result = 0;
//         long place = 1;
        
//         while (n > 0) {
//             long digit = n % 10;
//             if (digit != 0) {
//                 result = digit * place + result;
//                 place *= 10;
//             }
//             n /= 10;
//         }
        
//         return result;
//     }
// }
class Solution {
    public long removeZeros(long n) {
        String s = Long.toString(n);
        String filtered = s.replace("0", "");
        return Long.parseLong(filtered);
    }
}