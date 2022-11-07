/**
 * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。
 * <p>
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 * <p>
 * <p>
 * <p>
 * 例如，在下面的 3×4 的矩阵中包含单词 "ABCCED"（单词中的字母已标出）。
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word =
 * "ABCCED"
 * 输出：true
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：board = [["a","b"],["c","d"]], word = "abcd"
 * 输出：false
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * m == board.length
 * n = board[i].length
 * 1 <= m, n <= 6
 * 1 <= word.length <= 15
 * board 和 word 仅由大小写英文字母组成
 * <p>
 * <p>
 * 注意：本题与主站 79 题相同：https://leetcode-cn.com/problems/word-search/
 * <p>
 * Related Topics 数组 回溯 矩阵 👍 673 👎 0
 */

package com.leetcode.editor.cn.offer;

/**
 * @Title 剑指 Offer 12_矩阵中的路径
 * @Date 2022-09-05 21:25:07
 */

public class P_Offer_JuZhenZhongDeLuJingLcof {
    public static void main(String[] args) {
        Solution solution = new P_Offer_JuZhenZhongDeLuJingLcof().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 首先考虑每个元素的可能性
     */
    class Solution {
        public boolean exist(char[][] board, String word) {

            char[] words = word.toCharArray();
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    //遍历每个元素  回溯进行判断
                    if (dfs(board, words, i, j, 0)) {
                        return true;
                    }
                }
            }
            return false;
        }

        boolean dfs(char[][] board, char[] word, int i, int j, int k) {
            //判断是否过界 ，是否相等
            if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) {
                return false;
            }
            //找到完整的字符
            if (k == word.length - 1) {
                return true;
            }
            //标记已经访问的元素
            board[i][j] = '\0';
            //回溯判断  上 下 左 右
            boolean res = dfs(board, word, i, j + 1, k + 1)
                || dfs(board, word, i, j - 1, k + 1)
                || dfs(board, word, i - 1, j, k + 1)
                || dfs(board, word, i + 1, j, k + 1);
            //还原找过的元素
            board[i][j] = word[k];
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}