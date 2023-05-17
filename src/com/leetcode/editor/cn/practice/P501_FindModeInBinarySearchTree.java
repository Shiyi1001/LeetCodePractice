/**
 * 给你一个含重复值的二叉搜索树（BST）的根节点 root ，找出并返回 BST 中的所有 众数（即，出现频率最高的元素）。
 * <p>
 * 如果树中有不止一个众数，可以按 任意顺序 返回。
 * <p>
 * 假定 BST 满足如下定义：
 * <p>
 * <p>
 * 结点左子树中所含节点的值 小于等于 当前节点的值
 * 结点右子树中所含节点的值 大于等于 当前节点的值
 * 左子树和右子树都是二叉搜索树
 * <p>
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [1,null,2,2]
 * 输出：[2]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = [0]
 * 输出：[0]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 树中节点的数目在范围 [1, 10⁴] 内
 * -10⁵ <= Node.val <= 10⁵
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：你可以不使用额外的空间吗？（假设由递归产生的隐式调用栈的开销不被计算在内）
 * <p>
 * Related Topics 树 深度优先搜索 二叉搜索树 二叉树 👍 553 👎 0
 */

package com.leetcode.editor.cn.practice;

import com.leetcode.editor.commons.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title 501_二叉搜索树中的众数
 * @Date 2022-11-30 21:43:55
 */

public class P501_FindModeInBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new P501_FindModeInBinarySearchTree().new Solution();
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

    /**
     * 根据BST的特性，当前二叉树的中序遍历重复的数字一定是连续出现的
     */
    class Solution {
        //记录出现的众数
        List<Integer> answer = new ArrayList<Integer>();
        //base 记录当前值，count 当前值重复数 maxCount 已扫描过的众数
        int base, count, maxCount;

        public int[] findMode(TreeNode root) {
            dfs(root);
            int[] mode = new int[answer.size()];
            for (int i = 0; i < answer.size(); ++i) {
                mode[i] = answer.get(i);
            }
            return mode;
        }

        // 中序遍历  左中右
        public void dfs(TreeNode o) {
            if (o == null) {
                return;
            }
            dfs(o.left);
            update(o.val);
            dfs(o.right);
        }

        // 对当前值进行处理
        public void update(int x) {
            //如果和当前值匹配
            if (x == base) {
                //数量加一
                ++count;
            } else {
                count = 1;
                base = x;
            }
            if (count == maxCount) {
                answer.add(base);
            }
            if (count > maxCount) {
                maxCount = count;
                answer.clear();
                answer.add(base);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}