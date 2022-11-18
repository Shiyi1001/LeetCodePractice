/**
 * 给定两个字符串 s 和 t ，它们只包含小写字母。
 * <p>
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * <p>
 * 请找出在 t 中被添加的字母。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：s = "abcd", t = "abcde"
 * 输出："e"
 * 解释：'e' 是那个被添加的字母。
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：s = "", t = "y"
 * 输出："y"
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 0 <= s.length <= 1000
 * t.length == s.length + 1
 * s 和 t 只包含小写字母
 * <p>
 * <p>
 * Related Topics 位运算 哈希表 字符串 排序 👍 366 👎 0
 */

package com.leetcode.editor.cn;

/**
 * @Title 389_找不同
 * @Date 2022-11-18 22:09:05
 */

public class P389_FindTheDifference {
    public static void main(String[] args) {
        Solution solution = new P389_FindTheDifference().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public char findTheDifference(String s, String t) {
            int[] cnt = new int[26];
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                cnt[c - 'a']++;
            }
            for (int i = 0; i < t.length(); i++) {
                char c = t.charAt(i);
                cnt[c - 'a']--;
                if (cnt[c - 'a'] < 0) {
                    return c;
                }
            }
            return ' ';
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}