/**
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 * <p>
 * <p>
 * 全部字母都是大写，比如 "USA" 。
 * 单词中所有字母都不是大写，比如 "leetcode" 。
 * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google" 。
 * <p>
 * <p>
 * 给你一个字符串 word 。如果大写用法正确，返回 true ；否则，返回 false 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：word = "USA"
 * 输出：true
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：word = "FlaG"
 * 输出：false
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= word.length <= 100
 * word 由小写和大写英文字母组成
 * <p>
 * <p>
 * Related Topics 字符串 👍 223 👎 0
 */

package com.leetcode.editor.cn;

/**
 * @Title 520_检测大写字母
 * @Date 2022-12-01 22:15:02
 */

public class P520_DetectCapital {
    public static void main(String[] args) {
        Solution solution = new P520_DetectCapital().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean detectCapitalUse(String word) {

            return word.equals(word.toUpperCase())
                || word.substring(1).equals(word.substring(1).toLowerCase());
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}