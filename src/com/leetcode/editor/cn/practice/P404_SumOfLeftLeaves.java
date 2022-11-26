/**
 * 给定二叉树的根节点 root ，返回所有左叶子之和。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * <p>
 * 输入: root = [3,9,20,null,null,15,7]
 * 输出: 24
 * 解释: 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入: root = [1]
 * 输出: 0
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示:
 * <p>
 * <p>
 * 节点数在 [1, 1000] 范围内
 * -1000 <= Node.val <= 1000
 * <p>
 * <p>
 * <p>
 * <p>
 * Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 523 👎 0
 */

package com.leetcode.editor.cn.practice;

import com.leetcode.editor.commons.TreeNode;

/**
 * @Title 404_左叶子之和
 * @Date 2022-11-19 21:59:38
 */

public class P404_SumOfLeftLeaves {
    public static void main(String[] args) {
        Solution solution = new P404_SumOfLeftLeaves().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public int sumOfLeftLeaves(TreeNode root) {
            return root == null ? 0 : dfs(root);
        }

        public int dfs(TreeNode node) {
            int sum = 0;
            if (node.left != null) {
                sum += isLeafNode(node.left) ? node.left.val : dfs(node.left);
            }
            if (node.right != null) {
                sum += dfs(node.right);
            }
            return sum;
        }

        public boolean isLeafNode(TreeNode node) {
            return node.left == null && node.right == null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}