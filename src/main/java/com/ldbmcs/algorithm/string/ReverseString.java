package com.ldbmcs.algorithm.string;

/**
 * 【简单】反转字符串:https://leetcode-cn.com/problems/reverse-string/
 * 输入：["h","e","l","l","o"] 输出：["o","l","l","e","h"]
 *
 * @author ldbmcs
 * @date 2020/8/16
 */
public class ReverseString {
    public static void reverse(char[] s) {
        int start = 0, end = s.length - 1;
        char tmp;
        while (start < end) {
            tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            start++;
            end--;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverse(s);
    }
}
