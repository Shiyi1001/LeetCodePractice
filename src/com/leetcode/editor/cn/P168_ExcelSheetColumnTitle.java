/**
 * 给你一个整数 columnNumber ，返回它在 Excel 表中相对应的列名称。
 * <p>
 * 例如：
 * <p>
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * <p>
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：columnNumber = 1
 * 输出："A"
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：columnNumber = 28
 * 输出："AB"
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：columnNumber = 701
 * 输出："ZY"
 * <p>
 * <p>
 * 示例 4：
 * <p>
 * <p>
 * 输入：columnNumber = 2147483647
 * 输出："FXSHRXW"
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= columnNumber <= 2³¹ - 1
 * <p>
 * <p>
 * Related Topics 数学 字符串 👍 549 👎 0
 */

package com.leetcode.editor.cn;

/**
 * @Title Excel表列名称
 * @Date 2022-08-11 21:05:38
 */

public class P168_ExcelSheetColumnTitle {
    public static void main(String[] args) {
        Solution solution = new P168_ExcelSheetColumnTitle().new Solution();
        System.out.println(solution.convertToTitle(701));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String convertToTitle(int columnNumber) {

            StringBuilder sb = new StringBuilder();
            while (columnNumber > 0) {
                columnNumber--;
                sb.append((char) (columnNumber % 26 + 'A'));
                columnNumber /= 26;
            }
            return sb.reverse().toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}