/**
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 * <p>
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums = [-10,-3,0,5,9]
 * 输出：[0,-3,9,-10,null,5]
 * 解释：[0,-10,5,null,-3,null,9] 也将被视为正确答案：
 * <p>
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums = [1,3]
 * 输出：[3,1]
 * 解释：[1,null,3] 和 [3,1] 都是高度平衡二叉搜索树。
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= nums.length <= 10⁴
 * -10⁴ <= nums[i] <= 10⁴
 * nums 按 严格递增 顺序排列
 * <p>
 * <p>
 * Related Topics 树 二叉搜索树 数组 分治 二叉树 👍 1101 👎 0
 */

package com.leetcode.editor.cn;

/**
 * @Title 将有序数组转换为二叉搜索树
 * @Date 2022-08-01 20:59:29
 */

public class P108_ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new P108_ConvertSortedArrayToBinarySearchTree().new Solution();
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
     * 二叉数中的中序遍历是升序的
     *
     */
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return sort(nums, 0, nums.length - 1);
        }

        TreeNode sort(int[] nums, int left, int right) {
            if (left > right) {
                return null;
            }
            int mind = (left + right) / 2;
            TreeNode root = new TreeNode(nums[mind]);
            root.left = sort(nums, left, mind - 1);
            root.right = sort(nums, mind + 1, right);
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}