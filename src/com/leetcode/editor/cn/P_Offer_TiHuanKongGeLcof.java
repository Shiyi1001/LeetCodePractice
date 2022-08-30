/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 * <p>
 * <p>
 * <p>
 * 限制：
 * <p>
 * 0 <= s 的长度 <= 10000
 * <p>
 * Related Topics 字符串 👍 339 👎 0
 */

package com.leetcode.editor.cn;

/**
 * @Title 剑指 Offer 05_替换空格
 * @Date 2022-08-30 22:33:30
 */

public class P_Offer_TiHuanKongGeLcof {
    public static void main(String[] args) {
        Solution solution = new P_Offer_TiHuanKongGeLcof().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String replaceSpace(String s) {
            return s.replaceAll(" ","%20");
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}