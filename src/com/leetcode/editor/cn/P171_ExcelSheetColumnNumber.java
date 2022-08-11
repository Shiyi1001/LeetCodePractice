/**
 * 给你一个字符串 columnTitle ，表示 Excel 表格中的列名称。返回 该列名称对应的列序号 。
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
 * 示例 1:
 * <p>
 * <p>
 * 输入: columnTitle = "A"
 * 输出: 1
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入: columnTitle = "AB"
 * 输出: 28
 * <p>
 * <p>
 * 示例 3:
 * <p>
 * <p>
 * 输入: columnTitle = "ZY"
 * 输出: 701
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= columnTitle.length <= 7
 * columnTitle 仅由大写英文组成
 * columnTitle 在范围 ["A", "FXSHRXW"] 内
 * <p>
 * <p>
 * Related Topics 数学 字符串 👍 343 👎 0
 */

package com.leetcode.editor.cn;

/**
 * @Title Excel 表列序号
 * @Date 2022-08-11 22:08:26
 */

public class P171_ExcelSheetColumnNumber {
    public static void main(String[] args) {
        Solution solution = new P171_ExcelSheetColumnNumber().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int titleToNumber(String columnTitle) {

            int number = 0;
            for (int i = 0; i < columnTitle.length(); i++) {
                int num = columnTitle.charAt(i) - 'A' + 1;
                number = number * 26 + num;
            }
            return number;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}