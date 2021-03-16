package com.ldbmcs.algorithm.medium;

/**
 * 两整数之和
 * 不使用运算符 + 和 - ，计算两整数 a 、b 之和。
 *
 * 输入: a = 1, b = 2
 * 输出: 3
 * 思路：两个整数a, b; a ^ b是无进位的相加； a&b得到每一位的进位；让无进位相加的结果与进位不断的异或，直到进位为0；
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
