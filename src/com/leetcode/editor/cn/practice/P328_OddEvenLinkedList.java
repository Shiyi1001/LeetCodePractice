//给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。 
//
// 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。 
//
// 示例 1: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 1->3->5->2->4->NULL
// 
//
// 示例 2: 
//
// 输入: 2->1->3->5->6->4->7->NULL 
//输出: 2->3->6->7->1->5->4->NULL 
//
// 说明: 
//
// 
// 应当保持奇数节点和偶数节点的相对顺序。 
// 链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。 
// 
// Related Topics 链表


package com.leetcode.editor.cn.practice;

/**
 * @Title 奇偶链表
 */
public class P328_OddEvenLinkedList {
    public static void main(String[] args) {
        Solution solution = new P328_OddEvenLinkedList().new Solution();

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
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode oddEvenList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            //奇数链表 头结点
            ListNode oddHead = head;
            //奇数链表 当前节点
            ListNode oddCur = oddHead;
            //偶数链表 头结点
            ListNode evenHead = oddHead.next;
            //偶数链表当前节点
            ListNode evenCur = evenHead;

            while (evenCur != null && evenCur.next != null) {
                //奇偶数分别放一个链表
                oddCur.next = oddCur.next.next;
                evenCur.next = evenCur.next.next;

                //奇偶指针后移
                oddCur = oddCur.next;
                evenCur = evenCur.next;
            }
            oddCur.next = evenHead;
            return oddHead;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}