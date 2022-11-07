/**
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问
 * k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入: 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1
 * <p>
 * 示例 2:
 * <p>
 * 输入: 10
 * 输出: 36
 * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36
 * <p>
 * 提示：
 * <p>
 * <p>
 * 2 <= n <= 58
 * <p>
 * <p>
 * 注意：本题与主站 343 题相同：https://leetcode-cn.com/problems/integer-break/
 * <p>
 * Related Topics 数学 动态规划 👍 505 👎 0
 */

package com.leetcode.editor.cn.offer;

/**
 * @Title 剑指 Offer 14- I_剪绳子
 * @Date 2022-09-19 22:19:21
 */

public class P_Offer_JianShengZiLcof {
    public static void main(String[] args) {
        Solution solution = new P_Offer_JianShengZiLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 动态规划
     */
    class Solution {
        public int cuttingRope(int n) {
            int[] dp = new int[n + 1];
            for (int i = 2; i <= n; i++) {
                int curMax = 0;
                for (int j = 1; j < i; j++) {
                    curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]));
                }
                dp[i] = curMax;
            }
            return dp[n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}