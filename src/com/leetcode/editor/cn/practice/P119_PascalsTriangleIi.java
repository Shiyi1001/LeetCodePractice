/**
 * 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
 * <p>
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * 输入: rowIndex = 3
 * 输出: [1,3,3,1]
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入: rowIndex = 0
 * 输出: [1]
 * <p>
 * <p>
 * 示例 3:
 * <p>
 * <p>
 * 输入: rowIndex = 1
 * 输出: [1,1]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示:
 * <p>
 * <p>
 * 0 <= rowIndex <= 33
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：
 * <p>
 * 你可以优化你的算法到 O(rowIndex) 空间复杂度吗？
 * <p>
 * Related Topics 数组 动态规划 👍 415 👎 0
 */

package com.leetcode.editor.cn.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title 杨辉三角 II
 * @Date 2022-08-05 21:37:20
 */

public class P119_PascalsTriangleIi {
    public static void main(String[] args) {
        Solution solution = new P119_PascalsTriangleIi().new Solution();
        System.out.println(solution.getRow(3));
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 滚动数组， 因为杨辉三角当前行的计算只涉及到上一行的数据
     */
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> pre = new ArrayList<>();
            for (int i = 0; i <= rowIndex; i++) {
                List<Integer> cur = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        cur.add(1);
                    } else {
                        cur.add(pre.get(j - 1) + pre.get(j));
                    }
                }
                pre = cur;
            }
            return pre;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}