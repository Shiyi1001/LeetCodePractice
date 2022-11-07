/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * <p>
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 2
 * 输出：2
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * 输入：n = 7
 * 输出：21
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * 输入：n = 0
 * 输出：1
 * <p>
 * 提示：
 * <p>
 * <p>
 * 0 <= n <= 100
 * <p>
 * <p>
 * 注意：本题与主站 70 题相同：https://leetcode-cn.com/problems/climbing-stairs/
 * <p>
 * <p>
 * <p>
 * Related Topics 记忆化搜索 数学 动态规划 👍 321 👎 0
 */

package com.leetcode.editor.cn.offer;

/**
 * @Title 剑指 Offer 10- II_青蛙跳台阶问题
 * @Date 2022-09-05 21:12:10
 */

public class P_Offer_QingWaTiaoTaiJieWenTiLcof {
    public static void main(String[] args) {
        Solution solution = new P_Offer_QingWaTiaoTaiJieWenTiLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * f(x) = f(x-1) + f(x -2)
     */
    class Solution {
        public int numWays(int n) {
            int p = 0, q = 0, r = 1;
            for (int i = 1; i <= n; i++) {
                p = q;
                q = r;
                r = (p + q) % 1000000007;
            }
            return r;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}