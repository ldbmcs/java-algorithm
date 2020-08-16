package com.ldbmcs.algorithm.string;

/**
 * 【简单】字符串相加：https://leetcode-cn.com/problems/add-strings/
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 *
 * @author ldbmcs
 * @date 2020/8/16
 */
public class AddStrings {
    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuilder res = new StringBuilder();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            res.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        res.reverse();
        return res.toString();
    }

    public static void main(String[] args) {
        String num1 = "12";
        String num2 = "189";
        String res = addStrings(num1, num2);
        System.out.println(res);
    }
}
