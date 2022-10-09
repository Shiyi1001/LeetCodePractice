/**
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 * <p>
 * <p>
 * <p>
 * 例如: 给定二叉树: [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * <p>
 * <p>
 * 返回：
 * <p>
 * [3,9,20,15,7]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 节点总数 <= 1000
 * <p>
 * <p>
 * Related Topics 树 广度优先搜索 二叉树 👍 232 👎 0
 */

package com.leetcode.editor.cn;

import com.leetcode.editor.commons.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Title 剑指 Offer 32 - I_从上到下打印二叉树
 * @Date 2022-09-22 22:09:08
 */

public class P_Offer_CongShangDaoXiaDaYinErChaShuLcof {
    public static void main(String[] args) {
        Solution solution = new P_Offer_CongShangDaoXiaDaYinErChaShuLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    /**
     * 广度优先遍历 借助queue 辅助  结合栈 先入先出的特性
     */
    class Solution {
        public int[] levelOrder(TreeNode root) {
            if (root == null) {
                return new int[0];
            }
            List<Integer> res = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<TreeNode>() {{
                add(root);
            }};
            while (!queue.isEmpty()) {
                // pool 返回并删除栈顶元素   peek返回但不删除栈顶元素
                TreeNode treeNode = queue.poll();
                res.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }
            }
            return res.stream().mapToInt(Integer::intValue).toArray();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}