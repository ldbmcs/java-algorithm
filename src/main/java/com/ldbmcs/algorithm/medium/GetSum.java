package com.ldbmcs.algorithm.medium;

/**
 * 两整数之和
 * 不使用运算符 + 和 - ，计算两整数 a 、b 之和。
 *
 * 输入: a = 1, b = 2
 * 输出: 3
 * 思路：两个整数a, b; a ^ b是无进位的相加； a&b得到每一位的进位；让无进位相加的结果与进位不断的异或，直到进位为0；
 * 5 + 7 = 12
 * 1. ：相加各位的值，不算进位，得到2。
 * 2. ：计算进位值，得到10. 如果这一步的进位值为0，那么第一步得到的值就是最终结果。
 * 3. ：重复上述两步，只是相加的值变成上述两步的得到的结果2和10，得到12。
 */
public class GetSum {
    public static void main(String[] args) {
        int a = -2;
        int b = 3;
        int res = getSum(a, b);
        System.out.println(res);
    }

    public static int getSum(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }
}
