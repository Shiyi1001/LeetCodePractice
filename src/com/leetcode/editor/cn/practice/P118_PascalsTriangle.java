/**
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
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
 * 输入: numRows = 5
 * 输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入: numRows = 1
 * 输出: [[1]]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示:
 * <p>
 * <p>
 * 1 <= numRows <= 30
 * <p>
 * <p>
 * Related Topics 数组 动态规划 👍 809 👎 0
 */

package com.leetcode.editor.cn.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title 杨辉三角
 * @Date 2022-08-04 22:48:04
 */

public class P118_PascalsTriangle {
    public static void main(String[] args) {
        Solution solution = new P118_PascalsTriangle().new Solution();
        System.out.println(solution.generate(5));
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 1
     * 1 1
     * 1 2 1
     * 1 3 3 1
     * 1 4 6 4 1
     * 满足 f(n)x = f(n - 1)[x-1] + f(n -1)[x]
     * i控制行数  j控制下标
     * list 下标从0开始
     */
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                List<Integer> rows = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        rows.add(1);
                    } else {
                        rows.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                    }
                }
                res.add(rows);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}