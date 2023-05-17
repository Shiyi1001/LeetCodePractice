/**
 * 给你一个二叉搜索树的根节点 root ，返回 树中任意两不同节点值之间的最小差值 。
 * <p>
 * 差值是一个正数，其数值等于两值之差的绝对值。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [4,2,6,1,3]
 * 输出：1
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = [1,0,48,null,null,12,49]
 * 输出：1
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 树中节点的数目范围是 [2, 10⁴]
 * 0 <= Node.val <= 10⁵
 * <p>
 * <p>
 * <p>
 * <p>
 * 注意：本题与 783 https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/
 * 相同
 * <p>
 * Related Topics 树 深度优先搜索 广度优先搜索 二叉搜索树 二叉树 👍 404 👎 0
 */

package com.leetcode.editor.cn.practice;

import com.leetcode.editor.commons.TreeNode;

/**
 * @Title 530_二叉搜索树的最小绝对差
 * @Date 2022-12-05 20:52:06
 */

public class P530_MinimumAbsoluteDifferenceInBst {
    public static void main(String[] args) {
        Solution solution = new P530_MinimumAbsoluteDifferenceInBst().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    /**
     * 二叉搜索树中序遍历得到的值序列是递增有序的
     */
    class Solution {
        int ans;
        // 前驱节点
        int pre;

        public int getMinimumDifference(TreeNode root) {
            ans = Integer.MAX_VALUE;
            pre = -1;
            dfs(root);
            return ans;
        }

        public void dfs(TreeNode node) {
            if (node == null) {
                return;
            }
            dfs(node.left);
            if (pre == -1) {
                pre = node.val;
            } else {
                ans = Math.min(ans, node.val - pre);
                pre = node.val;
            }
            dfs(node.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}