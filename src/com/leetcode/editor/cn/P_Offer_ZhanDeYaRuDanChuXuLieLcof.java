/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如，序列 {1,2,3,4,5} 是某栈的压
 * 栈序列，序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 * 输出：true
 * 解释：我们可以按以下顺序执行：
 * push(1), push(2), push(3), push(4), pop() -> 4,
 * push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * 输入：pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
 * 输出：false
 * 解释：1 不能在 2 之前弹出。
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 0 <= pushed.length == popped.length <= 1000
 * 0 <= pushed[i], popped[i] < 1000
 * pushed 是 popped 的排列。
 * <p>
 * <p>
 * 注意：本题与主站 946 题相同：https://leetcode-cn.com/problems/validate-stack-sequences/
 * <p>
 * Related Topics 栈 数组 模拟 👍 380 👎 0
 */

package com.leetcode.editor.cn;

import java.util.Stack;

/**
 * @Title 剑指 Offer 31_栈的压入、弹出序列
 * @Date 2022-09-21 21:30:17
 */

public class P_Offer_ZhanDeYaRuDanChuXuLieLcof {
    public static void main(String[] args) {
        Solution solution = new P_Offer_ZhanDeYaRuDanChuXuLieLcof().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean validateStackSequences(int[] pushed, int[] popped) {
            Stack<Integer> stack = new Stack<>();
            int i = 0;
            for (int num : pushed) {
                // num 入栈
                stack.push(num);
                //循环出栈判断   栈顶元素= 弹出序列的当前元素 是否成立
                while (!stack.isEmpty() && stack.peek() == popped[i]) {
                    stack.pop();
                    i++;
                }
            }
            return stack.isEmpty();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}