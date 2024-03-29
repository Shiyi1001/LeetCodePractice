//给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。 
//
// 进阶： 
//
// 
// 一个直观的解决方案是使用 O(mn) 的额外空间，但这并不是一个好的解决方案。 
// 一个简单的改进方案是使用 O(m + n) 的额外空间，但这仍然不是最好的解决方案。 
// 你能想出一个仅使用常量空间的解决方案吗？ 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：matrix = [[1,1,1],[1,0,1],[1,1,1]]
//输出：[[1,0,1],[0,0,0],[1,0,1]]
// 
//
// 示例 2： 
//
// 
//输入：matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
//输出：[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
// 
//
// 
//
// 提示： 
//
// 
// m == matrix.length 
// n == matrix[0].length 
// 1 <= m, n <= 200 
// -231 <= matrix[i][j] <= 231 - 1 
// 
// Related Topics 数组 哈希表 矩阵


package com.leetcode.editor.cn.practice;

import java.util.Arrays;

/**
 * @Title 矩阵置零
 */
public class P73_SetMatrixZeroes {
    public static void main(String[] args) {
        Solution solution = new P73_SetMatrixZeroes().new Solution();
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        solution.setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void setZeroes(int[][] matrix) {

            //row[i] 表示 第i行是否有0 col[i]表示第i列是否有0
            boolean[] col = new boolean[matrix[0].length];
            boolean[] row = new boolean[matrix.length];

            //判断行和列有0的情况
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    //如果当前位置有0  那么当前行列都应该标注为0
                    if (matrix[i][j] == 0) {
                        col[j] = true;
                        row[i] = true;
                    }
                }
            }

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (col[j] || row[i]) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}