package leetcode;

/**
 * 两数相乘
 * 不允许超位数
 * 所以需要模拟乘法过程
 * @author 乔飞宇
 * @version 1.0
 */
public class _43_M {
    public String multiply(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        int[] result = new int[n1 + n2 + 1];
        for (int i = n1; i > 0 ; i--) {
            int carry = 0;
            int a = num1.charAt(i) - '0';
            for (int j = n2; j > 0; j--) {
                int b = num2.charAt(j) - '0';
                int temp = a * b + result[i + j + 1] + carry;

                carry = temp / 10;
                result[i + j + 1] = temp % 10;
            }
            result[i] += carry;
                }
        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            if(!(sb.length() == 0 && digit == 0)){
                sb.append(digit);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
