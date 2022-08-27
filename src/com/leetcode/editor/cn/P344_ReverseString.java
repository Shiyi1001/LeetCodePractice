/**
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 * <p>
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：s = ["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：s = ["H","a","n","n","a","h"]
 * 输出：["h","a","n","n","a","H"]
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= s.length <= 10⁵
 * s[i] 都是 ASCII 码表中的可打印字符
 * <p>
 * <p>
 * Related Topics 递归 双指针 字符串 👍 652 👎 0
 */

package com.leetcode.editor.cn;

/**
 * @Title 反转字符串
 * @Date 2022-08-27 01:22:34
 */

public class P344_ReverseString {
    public static void main(String[] args) {
        Solution solution = new P344_ReverseString().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void reverseString(char[] s) {
            int low = 0, high = s.length - 1;
            while (low < high) {
                char temp = s[low];
                s[low] = s[high];
                s[high] = temp;
                low++;
                high--;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}