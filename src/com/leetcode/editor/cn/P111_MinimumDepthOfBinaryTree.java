/**
 * 给定一个二叉树，找出其最小深度。
 * <p>
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * <p>
 * 说明：叶子节点是指没有子节点的节点。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：2
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = [2,null,3,null,4,null,5,null,6]
 * 输出：5
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 树中节点数的范围在 [0, 10⁵] 内
 * -1000 <= Node.val <= 1000
 * <p>
 * <p>
 * Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 811 👎 0
 */

package com.leetcode.editor.cn;

/**
 * @Title 二叉树的最小深度
 * @Date 2022-08-03 20:33:45
 */

public class P111_MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        Solution solution = new P111_MinimumDepthOfBinaryTree().new Solution();
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

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            if (root.left == null && root.right == null) {
                return 1;
            }
            int min = Integer.MAX_VALUE;
            if (root.left != null) {
                min = Math.min(minDepth(root.left), min);
            }
            if(root.right != null){
                min = Math.min(minDepth(root.right),min);
            }
            return min + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}