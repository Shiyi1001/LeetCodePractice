//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。 
//
// 示例: 
//
// 输入: [-2,1,-3,4,-1,2,1,-5,4],
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
// 
//
// 进阶: 
//
// 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。 
// Related Topics 数组 分治算法 动态规划


package com.leetcode.editor.cn.practice;

/**
 * @Title 最大子数组和
 */
public class P53_MaximumSubarray {
    public static void main(String[] args) {
        Solution solution = new P53_MaximumSubarray().new Solution();
        int[] nums = {-3, -1, -2};
        int[] nums2 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(solution.maxSubArray(nums));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxSubArray(int[] nums) {
            int maxSum = nums[0];
            int sum = 0;
            for (int num : nums) {
                sum = sum > 0 ? sum + num : num;
                maxSum = Math.max(maxSum, sum);
            }
            return maxSum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}