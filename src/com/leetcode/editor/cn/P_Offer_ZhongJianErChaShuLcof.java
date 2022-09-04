/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
 * <p>
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 * Output: [3,9,20,null,null,15,7]
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * Input: preorder = [-1], inorder = [-1]
 * Output: [-1]
 * <p>
 * <p>
 * <p>
 * <p>
 * 限制：
 * <p>
 * 0 <= 节点个数 <= 5000
 * <p>
 * <p>
 * <p>
 * 注意：本题与主站 105 题重复：https://leetcode-cn.com/problems/construct-binary-tree-from-
 * preorder-and-inorder-traversal/
 * <p>
 * Related Topics 树 数组 哈希表 分治 二叉树 👍 890 👎 0
 */

package com.leetcode.editor.cn;

import com.leetcode.editor.commons.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title 剑指 Offer 07_重建二叉树
 * @Date 2022-09-03 22:20:19
 */

public class P_Offer_ZhongJianErChaShuLcof {
    public static void main(String[] args) {
        Solution solution = new P_Offer_ZhongJianErChaShuLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
    /**
     * 前序遍历  根左右
     * 中序遍历 左根右
     */
    class Solution {
        Map<Integer, Integer> indexMap = new HashMap<>();

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            int n = preorder.length;
            for (int i = 0; i < n; i++) {
                indexMap.put(inorder[i], i);
            }
            return bulieTreeHelper(preorder, inorder, 0, n - 1, 0, n - 1);
        }

        private TreeNode bulieTreeHelper(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
            if (preorder_left > preorder_right) {
                return null;
            }
            //前序遍历第一个节点就根节点
            int preorder_root = preorder_left;
            //在中序遍历中定位根节点
            int inorder_root = indexMap.get(preorder[preorder_root]);

            TreeNode root = new TreeNode(preorder[preorder_root]);

            //左子树节点数
            int left_size = inorder_root - inorder_left;

            root.left = bulieTreeHelper(preorder, inorder, preorder_left + 1, preorder_left + left_size, inorder_left, inorder_root - 1);

            root.right = bulieTreeHelper(preorder, inorder, preorder_left + left_size + 1, preorder_right, inorder_root + 1, inorder_right);
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}