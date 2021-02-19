package com.ldbmcs.algorithm.array;

/**
 * 给定一个整数数组，找出总和最大的连续数列，并返回总和。
 * 输入： [-2,1,-3,4,-1,2,1,-5,4]
 * 输出： 6
 * 解释： 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class MaxSubArray {

    public static int findMaxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int sum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i] + sum, nums[i]);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int res = findMaxSubArray(nums);
        System.out.print(res);
    }
}
