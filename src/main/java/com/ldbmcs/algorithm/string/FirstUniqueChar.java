package com.ldbmcs.algorithm.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 【简单】字符串中的第一个唯一字符：https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * s = "leetcode" 返回 0
 * s = "loveleetcode" 返回 2
 *
 * @author ldbmcs
 * @date 2020/8/16
 */
public class FirstUniqueChar {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>(26);
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        String s = "leetcode";
        String s = "loveleetcode";
        int res = firstUniqChar(s);
        System.out.print(res);
    }
}
