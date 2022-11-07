/**
 * 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
 * <p>
 * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
 * <p>
 * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：x = 4
 * 输出：2
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：x = 8
 * 输出：2
 * 解释：8 的算术平方根是 2.82842..., 由于返回类型是整数，小数部分将被舍去。
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 0 <= x <= 2³¹ - 1
 * <p>
 * <p>
 * Related Topics 数学 二分查找 👍 1086 👎 0
 */

package com.leetcode.editor.cn.practice;

/**
 * @Title x的平方根
 */
public class P69_Sqrtx {
    public static void main(String[] args) {
        Solution solution = new P69_Sqrtx().new Solution();
        System.out.println(solution.mySqrt(1));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int mySqrt(int x) {
            //整除 向下取整
            long left = 0, right = x / 2 + 1;
            while (left <= right) {
                long mind = (left + right) / 2;
                if (mind * mind <= x) {
                    left = mind + 1;
                } else {
                    right = mind - 1;
                }
            }
            return (int) (left - 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}