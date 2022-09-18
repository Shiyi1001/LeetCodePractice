/**
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * 输入：s = "abaccdeff"
 * 输出：'b'
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入：s = ""
 * 输出：' '
 * <p>
 * <p>
 * <p>
 * <p>
 * 限制：
 * <p>
 * 0 <= s 的长度 <= 50000
 * <p>
 * Related Topics 队列 哈希表 字符串 计数 👍 265 👎 0
 */

package com.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title 剑指 Offer 50_第一个只出现一次的字符
 * @Date 2022-09-18 22:16:04
 */

public class P_Offer_DiYiGeZhiChuXianYiCiDeZiFuLcof {
    public static void main(String[] args) {
        Solution solution = new P_Offer_DiYiGeZhiChuXianYiCiDeZiFuLcof().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public char firstUniqChar(String s) {
            Map<Character, Boolean> map = new HashMap<>();
            char[] chars = s.toCharArray();
            for (char aChar : chars) {
                map.put(aChar, !map.containsKey(aChar));
            }
            for (char aChar : chars) {
                if (map.get(aChar)) {
                    return aChar;
                }
            }
            return ' ';
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}