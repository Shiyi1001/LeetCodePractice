/**
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
 * <p>
 * <p>
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * <p>
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 * <p>
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：n = 2
 * 输出：1
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：n = 5
 * 输出：5
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 0 <= n <= 100
 * <p>
 * <p>
 * Related Topics 记忆化搜索 数学 动态规划 👍 405 👎 0
 */

package com.leetcode.editor.cn.offer;

/**
 * @Title 剑指 Offer 10- I_斐波那契数列
 * @Date 2022-09-02 20:39:01
 */

public class P_Offer_FeiBoNaQiShuLieLcof {
    public static void main(String[] args) {
        Solution solution = new P_Offer_FeiBoNaQiShuLieLcof().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int fib(int n) {

            if (n == 0) {
                return 0;
            }

            if (n == 1) {
                return 1;
            }
            return fib(n - 1) + fib(n - 2);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}