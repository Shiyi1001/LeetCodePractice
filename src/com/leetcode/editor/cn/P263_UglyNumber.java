/**
 * 丑数 就是只包含质因数 2、3 和 5 的正整数。
 * <p>
 * 给你一个整数 n ，请你判断 n 是否为 丑数 。如果是，返回 true ；否则，返回 false 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：n = 6
 * 输出：true
 * 解释：6 = 2 × 3
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：n = 1
 * 输出：true
 * 解释：1 没有质因数，因此它的全部质因数是 {2, 3, 5} 的空集。习惯上将其视作第一个丑数。
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：n = 14
 * 输出：false
 * 解释：14 不是丑数，因为它包含了另外一个质因数 7 。
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * -2³¹ <= n <= 2³¹ - 1
 * <p>
 * <p>
 * Related Topics 数学 👍 339 👎 0
 */

package com.leetcode.editor.cn;

/**
 * @Title 丑数
 * @Date 2022-08-23 21:54:30
 */

public class P263_UglyNumber {
    public static void main(String[] args) {
        Solution solution = new P263_UglyNumber().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isUgly(int n) {
            if (n <= 0) {
                return false;
            }
            int[] nums = new int[]{2, 3, 5};
            for (int num : nums) {
                while (n % num == 0) {
                    n /= num;
                }
            }
            return n == 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}