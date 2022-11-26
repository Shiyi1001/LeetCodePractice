/**
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 * <p>
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 * <p>
 * 示例:
 * <p>
 * 输入: "Hello, my name is John"
 * 输出: 5
 * 解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作 1 个单词。
 * <p>
 * <p>
 * Related Topics 字符串 👍 191 👎 0
 */

package com.leetcode.editor.cn.practice;

/**
 * @Title 434_字符串中的单词数
 * @Date 2022-11-22 22:01:51
 */

public class P434_NumberOfSegmentsInAString {
    public static void main(String[] args) {
        Solution solution = new P434_NumberOfSegmentsInAString().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countSegments(String s) {

            int length = s.length(), sum = 0;
            for (int i = 0; i < length; ) {
                if (s.charAt(i) == ' ') {
                    i++;
                    continue;
                }
                while (i < length && s.charAt(i) != ' ') {
                    i++;
                }
                sum++;
            }
            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}