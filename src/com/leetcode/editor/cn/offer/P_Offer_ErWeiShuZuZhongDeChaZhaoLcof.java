/**
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数
 * ，判断数组中是否含有该整数。
 * <p>
 * <p>
 * <p>
 * 示例:
 * <p>
 * 现有矩阵 matrix 如下：
 * <p>
 * <p>
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * <p>
 * <p>
 * 给定 target = 5，返回 true。
 * <p>
 * 给定 target = 20，返回 false。
 * <p>
 * <p>
 * <p>
 * 限制：
 * <p>
 * 0 <= n <= 1000
 * <p>
 * 0 <= m <= 1000
 * <p>
 * <p>
 * <p>
 * 注意：本题与主站 240 题相同：https://leetcode-cn.com/problems/search-a-2d-matrix-ii/
 * <p>
 * Related Topics 数组 二分查找 分治 矩阵 👍 771 👎 0
 */

package com.leetcode.editor.cn.offer;

/**
 * @Title 剑指 Offer 04_二维数组中的查找
 * @Date 2022-08-30 20:34:40
 */

public class P_Offer_ErWeiShuZuZhongDeChaZhaoLcof {
    public static void main(String[] args) {
        Solution solution = new P_Offer_ErWeiShuZuZhongDeChaZhaoLcof().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 左上角 往右增大 往下增大
     * 右上角 往左减小  往下增大
     * 左下角 往右增大 往上减小
     * 右下角 往左减小 往上减小
     * <p>
     * 所以可以选择右上角和左下角 进行标记
     */
    class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return false;
            }
            int rowIndex = 0;
            int cloumIndex = matrix[0].length - 1;
            while (rowIndex < matrix.length && cloumIndex >= 0) {
                if (target == matrix[rowIndex][cloumIndex]) {
                    return true;
                } else if (target > matrix[rowIndex][cloumIndex]) {
                    rowIndex++;
                } else {
                    cloumIndex--;
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}