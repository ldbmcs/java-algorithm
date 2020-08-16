package com.ldbmcs.algorithm.string;

/**
 * 【简单】旋转字符串：https://leetcode-cn.com/problems/rotate-string/
 * 给定两个字符串, A和B。A的旋转操作就是将A最左边的字符移动到最右边。例如, 若A = 'abcde'，在移动一次之后结果就是'bcdea'。如果在若干次旋转操作之后，A能变成B，那么返回True。
 * 输入: A = 'abcde', B = 'cdeab' 输出: true
 * 输入: A = 'abcde', B = 'abced' 输出: false
 *
 * @author ldbmcs
 * @date 2020/8/16
 */
public class RotateString {
    public static boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }

    public static void main(String[] args) {
        String A = "abcde";
//        String B = "cdeab";
        String B = "abced";
        boolean res = rotateString(A, B);
        System.out.print(res);
    }
}
