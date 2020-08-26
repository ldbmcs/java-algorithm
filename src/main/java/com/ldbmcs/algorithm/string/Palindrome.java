package com.ldbmcs.algorithm.string;

/**
 * 【简单】验证回文串：https://leetcode-cn.com/problems/valid-palindrome/
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 输入: "A man, a plan, a canal: Panama"  输出: true
 * 输入: "race a car" 输出: false
 *
 * @author ldbmcs
 * @date 2020/8/26
 */
public class Palindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder sgood = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sgood.append(Character.toLowerCase(ch));
            }
        }
        int n = sgood.length();
        int left = 0, right = n - 1;
        while (left < right) {
            if (Character.toLowerCase(sgood.charAt(left)) != Character.toLowerCase(sgood.charAt(right))) {
                return false;
            }
            ++left;
            --right;
        }
        return true;
    }

    public static void main(String[] args) {
//        Boolean res = isPalindrome("A man, a plan, a canal: Panama");
        Boolean res = isPalindrome("race a car");
        System.out.println(res);
    }
}
