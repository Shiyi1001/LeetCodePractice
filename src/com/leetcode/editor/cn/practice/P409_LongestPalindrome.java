/**
 * 给定一个包含大写字母和小写字母的字符串
 * s ，返回 通过这些字母构造成的 最长的回文串 。
 * <p>
 * 在构造过程中，请注意 区分大小写 。比如 "Aa" 不能当做一个回文字符串。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * 输入:s = "abccccdd"
 * 输出:7
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入:s = "a"
 * 输入:1
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入:s = "aaaaaccc"
 * 输入:7
 * <p>
 * 提示:
 * <p>
 * <p>
 * 1 <= s.length <= 2000
 * s 只由小写 和/或 大写英文字母组成
 * <p>
 * <p>
 * Related Topics 贪心 哈希表 字符串 👍 485 👎 0
 */

package com.leetcode.editor.cn.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title 409_最长回文串
 * @Date 2022-11-20 22:03:47
 */

public class P409_LongestPalindrome {
    public static void main(String[] args) {
        Solution solution = new P409_LongestPalindrome().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestPalindrome(String s) {
            Map<Character, Integer> map = new HashMap<>();
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
                if (map.get(c) == 2) {
                    sum += 2;
                    map.remove(c);
                }
            }
            if (map.keySet().size() >= 1) {
                sum++;
            }
            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}