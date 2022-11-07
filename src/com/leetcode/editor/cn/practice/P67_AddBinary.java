/**
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * <p>
 * 输入为 非空 字符串且只包含数字 1 和 0。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * <p>
 * 示例 2:
 * <p>
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 每个字符串仅由字符 '0' 或 '1' 组成。
 * 1 <= a.length, b.length <= 10^4
 * 字符串如果不是 "0" ，就都不含前导零。
 * <p>
 * Related Topics 位运算 数学 字符串 模拟 👍 847 👎 0
 */

package com.leetcode.editor.cn.practice;

/**
 * @Title 二进制求和
 */
public class P67_AddBinary {
    public static void main(String[] args) {
        Solution solution = new P67_AddBinary().new Solution();
        System.out.println(solution.addBinary("11", "1"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String addBinary(String a, String b) {

            int m = a.length() - 1, n = b.length() - 1;
            int carry = 0;
            StringBuilder sb = new StringBuilder();
            while (m >= 0 || n >= 0) {
                // 使用字符串的ASCII码  位数不够的补0
                int ai = m >= 0 ? a.charAt(m) - '0' : 0;
                int bi = n >= 0 ? b.charAt(n) - '0' : 0;
                m--;
                n--;
                int cur = (ai + bi + carry) % 2;    //当前位
                carry = (ai + bi + carry) / 2;  //进位
                sb.append(cur);
            }
            //最高位仍有进位
            if (carry == 1) {
                sb.append(carry);
            }
            return sb.reverse().toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}