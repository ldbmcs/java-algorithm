package com.ldbmcs.algorithm.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串的长度。
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int res = 0;
        String[] charArray = s.split("");
        for (int i = 0; i < charArray.length; i++) {
            if (charArray.length - i > res) {
                List<String> resArray = new ArrayList<>();
                resArray.add(charArray[i]);
                for (int j = i + 1; j < charArray.length; j++) {
                    if (resArray.contains(charArray[j])) {
                        break;
                    } else {
                        resArray.add(charArray[j]);
                    }
                }
                if (resArray.size() > res) {
                    res = resArray.size();
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }
}
