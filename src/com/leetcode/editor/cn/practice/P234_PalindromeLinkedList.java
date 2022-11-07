/**
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,2,1]
 * 输出：true
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：head = [1,2]
 * 输出：false
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 链表中节点数目在范围[1, 10⁵] 内
 * 0 <= Node.val <= 9
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 * <p>
 * Related Topics 栈 递归 链表 双指针 👍 1479 👎 0
 */

package com.leetcode.editor.cn.practice;

import com.leetcode.editor.commons.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title 回文链表
 * @Date 2022-08-18 16:59:56
 */

public class P234_PalindromeLinkedList {
    public static void main(String[] args) {
        Solution solution = new P234_PalindromeLinkedList().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public boolean isPalindrome(ListNode head) {

            List<Integer> list = new ArrayList<>();

            ListNode cur = head;
            while (cur != null) {
                list.add(cur.val);
                cur = cur.next;
            }
            int start = 0, end = list.size() - 1;
            while (start < end) {
                if (!list.get(start).equals(list.get(end))) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }

        public boolean isPalindrome2(ListNode head) {

            if (head == null || head.next == null) {
                return false;
            }
            ListNode slow = head, fast = head;
            ListNode pre = head, prepre = null;
            while (fast != null && fast.next != null) {
                pre = slow;
                slow = slow.next;
                fast = fast.next.next;
                pre.next = prepre;
                prepre = pre;
            }
            if (fast != null) {
                slow = slow.next;
            }
            while (pre != null && slow != null) {
                if (pre.val != slow.val) {
                    return false;
                }
                pre = pre.next;
                slow = slow.next;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}