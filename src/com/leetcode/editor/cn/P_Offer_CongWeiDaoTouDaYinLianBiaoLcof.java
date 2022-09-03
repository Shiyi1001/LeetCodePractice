/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 * <p>
 * <p>
 * <p>
 * 限制：
 * <p>
 * 0 <= 链表长度 <= 10000
 * <p>
 * Related Topics 栈 递归 链表 双指针 👍 327 👎 0
 */

package com.leetcode.editor.cn;

import com.leetcode.editor.commons.ListNode;

import java.util.Stack;

/**
 * @Title 剑指 Offer 06_从尾到头打印链表
 * @Date 2022-09-01 23:03:23
 */

public class P_Offer_CongWeiDaoTouDaYinLianBiaoLcof {
    public static void main(String[] args) {
        Solution solution = new P_Offer_CongWeiDaoTouDaYinLianBiaoLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public int[] reversePrint(ListNode head) {
            Stack<Integer> stack = new Stack<>();
            ListNode node = head;
            while (node != null) {
                stack.push(node.val);
                node = node.next;
            }
            int[] arry = new int[stack.size()];
            for (int i = 0; i < arry.length; i++) {
                arry[i] = stack.pop();
            }
            return arry;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}