/**
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 * <p>
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 * <p>
 * 例如: 给定的树 A:
 * <p>
 * 3 / \ 4 5 / \ 1 2 给定的树 B：
 * <p>
 * 4 / 1 返回 true，因为 B 与 A 的一个子树拥有相同的结构和节点值。
 * <p>
 * 示例 1：
 * <p>
 * 输入：A = [1,2,3], B = [3,1]
 * 输出：false
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * 输入：A = [3,4,5,1,2], B = [4,1]
 * 输出：true
 * <p>
 * 限制：
 * <p>
 * 0 <= 节点个数 <= 10000
 * <p>
 * Related Topics 树 深度优先搜索 二叉树 👍 637 👎 0
 */

package com.leetcode.editor.cn.offer;

import com.leetcode.editor.commons.TreeNode;

/**
 * @Title 剑指 Offer 26_树的子结构
 * @Date 2022-09-20 20:51:10
 */

public class P_Offer_ShuDeZiJieGouLcof {
    public static void main(String[] args) {
        Solution solution = new P_Offer_ShuDeZiJieGouLcof().new Solution();
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
    class Solution {
        public boolean isSubStructure(TreeNode A, TreeNode B) {
            //若A B 都为空则false
            if (A == null || B == null) {
                return false;
            }
            // B 是以A 为根节点 的子树 || B 是 A的左子树  || B 是A的右子树
            return isContains(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
        }

        boolean isContains(TreeNode A, TreeNode B) {
            //如果B 为空 则 说明查找完毕  B是A 的子树
            if (B == null) {
                return true;
            }
            //若B不为空且 A为空 或者 a节点值 不等于 B节点值 则返回false
            if (A == null || A.val != B.val) {
                return false;
            }
            return isContains(A.left, B.left) && isContains(A.right, B.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}