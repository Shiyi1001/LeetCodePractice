/**
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * <p>
 * 要求时间复杂度为O(n)。
 * <p>
 * <p>
 * <p>
 * 示例1:
 * <p>
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= arr.length <= 10^5
 * -100 <= arr[i] <= 100
 * <p>
 * <p>
 * 注意：本题与主站 53 题相同：https://leetcode-cn.com/problems/maximum-subarray/
 * <p>
 * <p>
 * <p>
 * Related Topics 数组 分治 动态规划 👍 603 👎 0
 */

package com.leetcode.editor.cn.offer;

/**
 * @Title 剑指 Offer 42_连续子数组的最大和
 * @Date 2022-09-17 21:26:23
 */

public class P_Offer_LianXuZiShuZuDeZuiDaHeLcof {
    public static void main(String[] args) {
        Solution solution = new P_Offer_LianXuZiShuZuDeZuiDaHeLcof().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 动态规划
     * 当 dp[i -1] <= 0，dp[i] =nums[i]
     * 当 dp[i -1] > 0，dp[i] =dp[i - 1] + nums[i]
     */
    class Solution {
        public int maxSubArray(int[] nums) {
            int res = nums[0];
            for (int i = 1; i < nums.length; i++) {
                nums[i] += Math.max(nums[i - 1], 0);
                res = Math.max(res, nums[i]);
            }
            return res;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}