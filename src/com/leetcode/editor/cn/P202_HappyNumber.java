/**
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * <p>
 * 「快乐数」 定义为：
 * <p>
 * <p>
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果这个过程 结果为 1，那么这个数就是快乐数。
 * <p>
 * <p>
 * 如果 n 是 快乐数 就返回 true ；不是，则返回 false 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：n = 19
 * 输出：true
 * 解释：
 * 1² + 9² = 82
 * 8² + 2² = 68
 * 6² + 8² = 100
 * 1² + 0² + 0² = 1
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：n = 2
 * 输出：false
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= n <= 2³¹ - 1
 * <p>
 * <p>
 * Related Topics 哈希表 数学 双指针 👍 1031 👎 0
 */

package com.leetcode.editor.cn;

/**
 * @Title 快乐数
 * @Date 2022-08-13 20:39:46
 */

public class P202_HappyNumber {
    public static void main(String[] args) {
        Solution solution = new P202_HappyNumber().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 最终 数字会变为1(快乐数) 或者无限循环
     * 快慢指针  如果是快乐数 则fast 会先到1 如果不是 则 fast一定会追上slow 相遇
     * 也可以用set进行存储
     */
    class Solution {
        public boolean isHappy(int n) {
            int fast = getNumber(n);
            int slow = n;
            while (fast != 1 && fast != slow) {
                slow = getNumber(slow);
                fast = getNumber(getNumber(fast));
            }
            return fast == 1;
        }

        int getNumber(int n) {
            int sum = 0;
            while (n > 0) {
                int d = n % 10;
                n = n / 10;
                sum += d * d;
            }
            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}