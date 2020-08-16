package com.ldbmcs.algorithm.array;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 两个数组的交集：https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2] 输出: [2,2]
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]  输出: [4,9]
 *
 * @author ldbmcs
 * @date 2020/8/16
 */
public class ArrayIntersection {

    /**
     * 使用集合实现
     */
    public static int[] findByList(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for (int number : nums1) {
            list1.add(number);
        }
        List<Integer> list2 = new ArrayList<>();
        for (Integer index : nums2) {
            if (list1.contains(index)) {
                list2.add(index);
                list1.remove(index);
            }
        }
        int[] res = new int[list2.size()];
        int i = 0;
        for (int num : list2) {
            res[i++] = num;
        }
        return res;
    }

    /**
     * 使用list stream 实现
     */
    public static int[] findByListStream(int[] nums1, int[] nums2) {
        final List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().filter(a -> {
            if (list1.contains(a)) {
                list1.remove(a);
                return true;
            }
            return false;
        }).collect(Collectors.toList());
        int[] res = new int[list2.size()];
        int i = 0;
        for (int num : list2) {
            res[i++] = num;
        }
        return res;
    }

    /**
     * 使用映射
     */
    public static int[] findByMap(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(nums1.length);
        for (int num : nums1) {
            map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            Integer count = map.get(num);
            if (count != null && count != 0) {
                list.add(num);
                map.put(num, count - 1);
            }
        }
        int[] res = new int[list.size()];
        int i = 0;
        for (int num : list) {
            res[i++] = num;
        }
        return res;
    }

    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 2, 1};
        int[] nums1 = {4, 9, 5};
//        int[] nums2 = {2, 2};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] result = findByMap(nums1, nums2);
//        int[] result = findByList(nums1, nums2);
//        int[] result = findByListStream(nums1, nums2);
        System.out.print(Arrays.toString(result));
    }
}
