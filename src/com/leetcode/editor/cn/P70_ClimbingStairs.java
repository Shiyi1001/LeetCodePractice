/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：n = 2
 * 输出：2
 * 解释：有两种方法可以爬到楼顶。
 * 1. 1 阶 + 1 阶
 * 2. 2 阶
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：n = 3
 * 输出：3
 * 解释：有三种方法可以爬到楼顶。
 * 1. 1 阶 + 1 阶 + 1 阶
 * 2. 1 阶 + 2 阶
 * 3. 2 阶 + 1 阶
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= n <= 45
 * <p>
 * Related Topics 记忆化搜索 数学 动态规划 👍 2546 👎 0
 */

package com.leetcode.editor.cn;

/**
 * @Date 2022-07-26 14:42:17
 */

public class P70_ClimbingStairs {
    public static void main(String[] args) {
        Solution solution = new P70_ClimbingStairs().new Solution();
        System.out.println(solution.climbStairs(4));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * f(x) = f(x - 1) + f(x - 2)
         *
         * @param n
         * @return
         */
        public int climbStairs(int n) {

            int p = 0, q = 0, r = 1;
            for (int i = 1; i <= n; i++) {
                p = q;
                q = r;
                r = p + q;
            }
            return r;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}