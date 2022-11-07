/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 解释："amanaplanacanalpanama" 是回文串
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入: "race a car"
 * 输出: false
 * 解释："raceacar" 不是回文串
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= s.length <= 2 * 10⁵
 * 字符串 s 由 ASCII 字符组成
 * <p>
 * <p>
 * Related Topics 双指针 字符串 👍 556 👎 0
 */

package com.leetcode.editor.cn.practice;

/**
 * @Title 验证回文串
 * @Date 2022-08-07 22:29:34
 */

public class P125_ValidPalindrome {
    public static void main(String[] args) {
        Solution solution = new P125_ValidPalindrome().new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 内置API Character.isLetterOrDigit 判断是否是数字或字母
     * reverse 字符串反转
     */
    class Solution {
        public boolean isPalindrome(String s) {

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i) >= '0' && s.charAt(i) <= '9') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                    sb.append(s.charAt(i));
                }
            }

            for (int i = 0; i < sb.length(); i++) {
                if (Character.toLowerCase(sb.charAt(i)) != Character.toLowerCase(sb.charAt(sb.length() - 1 - i))) {
                    return false;
                }
            }
            return true;
        }

        /**
         * 双指针 只进行一次遍历
         *
         * @param s
         * @return
         */
        public boolean isPalindrome2(String s) {

            int left = 0, right = s.length() - 1;
            while (left < right) {
                while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                    left++;
                }
                while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                    right--;
                }
                if (left < right) {
                    if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                        return false;
                    }
                    left++;
                    right--;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}