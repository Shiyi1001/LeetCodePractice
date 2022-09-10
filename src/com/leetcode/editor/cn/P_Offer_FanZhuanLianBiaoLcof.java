/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * <p>
 * <p>
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * <p>
 * <p>
 * <p>
 * 限制：
 * <p>
 * 0 <= 节点个数 <= 5000
 * <p>
 * <p>
 * <p>
 * 注意：本题与主站 206 题相同：https://leetcode-cn.com/problems/reverse-linked-list/
 * <p>
 * Related Topics 递归 链表 👍 482 👎 0
 */

package com.leetcode.editor.cn;

import com.leetcode.editor.commons.ListNode;

/**
 * @Title 剑指 Offer 24_反转链表
 * @Date 2022-09-10 20:06:54
 */

public class P_Offer_FanZhuanLianBiaoLcof {
    public static void main(String[] args) {
        Solution solution = new P_Offer_FanZhuanLianBiaoLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode pre = null, cur = head;
            while (cur != null) {
                ListNode temp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = temp;
            }
            return pre;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}