/**
 * 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum 。判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和
 * targetSum 。如果存在，返回 true ；否则，返回 false 。
 * <p>
 * 叶子节点 是指没有子节点的节点。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
 * 输出：true
 * 解释：等于目标和的根节点到叶节点路径如上图所示。
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = [1,2,3], targetSum = 5
 * 输出：false
 * 解释：树中存在两条根节点到叶子节点的路径：
 * (1 --> 2): 和为 3
 * (1 --> 3): 和为 4
 * 不存在 sum = 5 的根节点到叶子节点的路径。
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：root = [], targetSum = 0
 * 输出：false
 * 解释：由于树是空的，所以不存在根节点到叶子节点的路径。
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 树中节点的数目在范围 [0, 5000] 内
 * -1000 <= Node.val <= 1000
 * -1000 <= targetSum <= 1000
 * <p>
 * <p>
 * Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 955 👎 0
 */

package com.leetcode.editor.cn;

/**
 * @Title 路径总和
 * @Date 2022-08-03 22:05:23
 */

public class P112_PathSum {
    public static void main(String[] args) {
        Solution solution = new P112_PathSum().new Solution();
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

    /**
     * 记录所有经过节点的和，在叶子节点进行判断
     */
    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            return helper(root, targetSum, 0);
        }

        boolean helper(TreeNode root, int targetSum, int nodeSum) {
            if (root == null) {
                return false;
            }
            nodeSum += root.val;
            if (root.left == null && root.right == null) {
                return nodeSum == targetSum;
            }
            return helper(root.left, targetSum, nodeSum) || helper(root.right, targetSum, nodeSum);
        }

        /**
         * 也可以不用变量 直接减去节点值
         */
        public boolean hasPathSum2(TreeNode root, int targetSum) {

            if (root == null) {
                return false;
            }
            if (root.left == null && root.right == null) {
                return root.val == targetSum;
            }
            return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}