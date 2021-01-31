// 从最后一位开始加，遇到9进1
// 如果当前位置加1后没有进位，返回结果
// 如果所有位都出现进位的情况，这是999...这种形式，直接新建一个1000...的结果返回
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length -1; i >= 0; i -- ) {
            digits[i] ++ ;
            if (digits[i] > 9) {
                digits[i] %= 10;
            } else {
                return digits;
            }
        }
        digits = new int[ digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
