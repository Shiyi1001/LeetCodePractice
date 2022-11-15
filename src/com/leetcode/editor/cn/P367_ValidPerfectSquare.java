/**
 * 给定一个 正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
 * <p>
 * 进阶：不要 使用任何内置的库函数，如 sqrt 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：num = 16
 * 输出：true
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：num = 14
 * 输出：false
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= num <= 2^31 - 1
 * <p>
 * <p>
 * Related Topics 数学 二分查找 👍 451 👎 0
 */

package com.leetcode.editor.cn;

/**
 * @Title 367_有效的完全平方数
 * @Date 2022-11-15 22:30:03
 */

public class P367_ValidPerfectSquare {
    public static void main(String[] args) {
        Solution solution = new P367_ValidPerfectSquare().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPerfectSquare(int num) {
            int low = 0, hight = num;
            while (low <= hight) {
                int mid = (low + hight) / 2;
                //不是long的话 会超时
                long squar = (long) mid * mid;
                if (squar > num) {
                    hight = mid - 1;
                } else if (squar < num) {
                    low = mid + 1;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}