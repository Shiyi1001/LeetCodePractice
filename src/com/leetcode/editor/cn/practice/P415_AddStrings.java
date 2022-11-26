/**
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和并同样以字符串形式返回。
 * <p>
 * 你不能使用任何內建的用于处理大整数的库（比如 BigInteger）， 也不能直接将输入的字符串转换为整数形式。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：num1 = "11", num2 = "123"
 * 输出："134"
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：num1 = "456", num2 = "77"
 * 输出："533"
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：num1 = "0", num2 = "0"
 * 输出："0"
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= num1.length, num2.length <= 10⁴
 * num1 和num2 都只包含数字 0-9
 * num1 和num2 都不包含任何前导零
 * <p>
 * <p>
 * Related Topics 数学 字符串 模拟 👍 642 👎 0
 */

package com.leetcode.editor.cn.practice;

/**
 * @Title 415_字符串相加
 * @Date 2022-11-21 20:45:56
 */

public class P415_AddStrings {
    public static void main(String[] args) {
        Solution solution = new P415_AddStrings().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String addStrings(String num1, String num2) {
            int n = num1.length() - 1, m = num2.length() - 1, add = 0;
            StringBuilder sb = new StringBuilder();
            // 最高位 可能进1
            while (n >= 0 || m >= 0 || add != 0) {
                int x = n >= 0 ? num1.charAt(n) - '0' : 0;
                int y = m >= 0 ? num2.charAt(m) - '0' : 0;
                int sum = x + y + add;
                add = sum / 10;
                sb.append(sum % 10);
                n--;
                m--;
            }
            return sb.reverse().toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}