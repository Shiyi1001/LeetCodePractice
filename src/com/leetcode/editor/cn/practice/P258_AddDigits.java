/**
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * 输入: num = 38
 * 输出: 2
 * 解释: 各位相加的过程为：
 * 38 --> 3 + 8 --> 11
 * 11 --> 1 + 1 --> 2
 * 由于 2 是一位数，所以返回 2。
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * 输入: num = 0
 * 输出: 0
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 0 <= num <= 2³¹ - 1
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：你可以不使用循环或者递归，在 O(1) 时间复杂度内解决这个问题吗？
 * <p>
 * Related Topics 数学 数论 模拟 👍 537 👎 0
 */

package com.leetcode.editor.cn.practice;

/**
 * @Title 各位相加
 * @Date 2022-08-22 21:55:38
 */

public class P258_AddDigits {
    public static void main(String[] args) {
        Solution solution = new P258_AddDigits().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int addDigits(int num) {
            while (num >= 10) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= num;
                }
                num = sum;
            }
            return num;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}