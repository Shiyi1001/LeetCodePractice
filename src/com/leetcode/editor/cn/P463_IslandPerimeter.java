/**
 * 给定一个 row x col 的二维网格地图 grid ，其中：grid[i][j] = 1 表示陆地， grid[i][j] = 0 表示水域。
 * <p>
 * 网格中的格子 水平和垂直 方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。
 * <p>
 * 岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周
 * 长。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * <p>
 * 输入：grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
 * 输出：16
 * 解释：它的周长是上面图片中的 16 个黄色的边
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：grid = [[1]]
 * 输出：4
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：grid = [[1,0]]
 * 输出：4
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * row == grid.length
 * col == grid[i].length
 * 1 <= row, col <= 100
 * grid[i][j] 为 0 或 1
 * <p>
 * <p>
 * Related Topics 深度优先搜索 广度优先搜索 数组 矩阵 👍 623 👎 0
 */

package com.leetcode.editor.cn;

/**
 * @Title 463_岛屿的周长
 * @Date 2022-11-27 22:40:27
 */

public class P463_IslandPerimeter {
    public static void main(String[] args) {
        Solution solution = new P463_IslandPerimeter().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        //右下左上 格子移动相加的值
        static int[] dx = {1, 0, -1, 0};
        static int[] dy = {0, 1, 0, -1};

        public int islandPerimeter(int[][] grid) {

            int m = grid.length, n = grid[0].length, res = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        for (int k = 0; k < 4; k++) {
                            int tx = i + dx[k];
                            int ty = j + dy[k];
                            //边界或与水域相邻
                            if (tx < 0 || tx >= m || ty < 0 || ty >= n || grid[tx][ty] == 0) {
                                res += 1;
                            }
                        }
                    }
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}