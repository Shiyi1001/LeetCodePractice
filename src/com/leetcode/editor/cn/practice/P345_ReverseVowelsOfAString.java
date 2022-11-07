/**
 * 给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。
 * <p>
 * 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：s = "hello"
 * 输出："holle"
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：s = "leetcode"
 * 输出："leotcede"
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= s.length <= 3 * 10⁵
 * s 由 可打印的 ASCII 字符组成
 * <p>
 * <p>
 * Related Topics 双指针 字符串 👍 260 👎 0
 */

package com.leetcode.editor.cn.practice;

/**
 * @Title 反转字符串中的元音字母
 * @Date 2022-08-27 19:06:09
 */

public class P345_ReverseVowelsOfAString {
    public static void main(String[] args) {
        Solution solution = new P345_ReverseVowelsOfAString().new Solution();
        System.out.println(solution.reverseVowels("ai"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseVowels(String s) {
            char[] chars = s.toCharArray();
            int low = 0, high = chars.length - 1;
            while (low < high) {
                while (low < chars.length && !isVowels(chars[low])) {
                    low++;
                }
                while (high > 0 && !isVowels(chars[high])) {
                    high--;
                }
                if (low < high) {
                    char temp = chars[low];
                    chars[low] = chars[high];
                    chars[high] = temp;
                }
                low++;
                high--;
            }
            return new String(chars);
        }

        public boolean isVowels(char c) {
            return "aeiouAEIOU".indexOf(c) != -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}