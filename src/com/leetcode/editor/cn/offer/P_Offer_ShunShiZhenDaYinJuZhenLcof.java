/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 * <p>
 * <p>
 * <p>
 * <p>
 * 限制：
 * <p>
 * <p>
 * 0 <= matrix.length <= 100
 * 0 <= matrix[i].length <= 100
 * <p>
 * <p>
 * 注意：本题与主站 54 题相同：https://leetcode-cn.com/problems/spiral-matrix/
 * <p>
 * Related Topics 数组 矩阵 模拟 👍 455 👎 0
 */

package com.leetcode.editor.cn.offer;

/**
 * @Title 剑指 Offer 29_顺时针打印矩阵
 * @Date 2022-09-14 22:32:44
 */

public class P_Offer_ShunShiZhenDaYinJuZhenLcof {
    public static void main(String[] args) {
        Solution solution = new P_Offer_ShunShiZhenDaYinJuZhenLcof().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] spiralOrder(int[][] matrix) {
            if (matrix.length == 0) {
                return new int[0];
            }
            int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1, x = 0;
            int[] res = new int[(right + 1) * (bottom + 1)];
            while (true) {
                //left -> right
                for (int i = left; i <= right; i++) {
                    res[x++] = matrix[top][i];
                }
                //是否打印完毕
                if (++top > bottom) {
                    break;
                }
                //top -> bottom
                for (int i = top; i <= bottom; i++) {
                    res[x++] = matrix[i][right];
                }
                if (--right < left) {
                    break;
                }
                // right -> left
                for (int i = right; i >= left; i--) {
                    res[x++] = matrix[bottom][i];
                }
                if (--bottom < top) {
                    break;
                }
                //bottom -> top
                for (int i = bottom; i >= top; i--) {
                    res[x++] = matrix[i][left];
                }
                if (++left > right) {
                    break;
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}