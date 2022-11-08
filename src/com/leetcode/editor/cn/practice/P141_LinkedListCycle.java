/**
 * 给你一个链表的头节点 head ，判断链表中是否有环。
 * <p>
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表
 * 中的位置（索引从 0 开始）。注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况。
 * <p>
 * 如果链表中存在环 ，则返回 true 。 否则，返回 false 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * <p>
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * <p>
 * <p>
 * 输入：head = [1,2], pos = 0
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * <p>
 * <p>
 * 输入：head = [1], pos = -1
 * 输出：false
 * 解释：链表中没有环。
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 链表中节点的数目范围是 [0, 10⁴]
 * -10⁵ <= Node.val <= 10⁵
 * pos 为 -1 或者链表中的一个 有效索引 。
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：你能用 O(1)（即，常量）内存解决此问题吗？
 * <p>
 * Related Topics 哈希表 链表 双指针 👍 1574 👎 0
 */

package com.leetcode.editor.cn.practice;

import java.util.HashSet;
import java.util.Set;

/**
 * @Title 环形链表
 * @Date 2022-08-09 21:29:33
 */

public class P141_LinkedListCycle {
    public static void main(String[] args) {
        Solution solution = new P141_LinkedListCycle().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        /**
         * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环
         * set中如果add() 失败则表明之前已经访问到达过了
         */
        public boolean hasCycle(ListNode head) {
            Set<ListNode> set = new HashSet<>();
            while (head != null) {
                if (!set.add(head)) {
                    return true;
                }
                head = head.next;
            }
            return false;
        }

        /**
         * 如果存在环  则快指针一定会追上慢指针
         */
        public boolean hasCycle2(ListNode head) {

            if (head == null || head.next == null) {
                return false;
            }
            ListNode slow = head, fast = head.next;
            while (slow != fast) {
                if (fast == null || fast.next == null) {
                    return false;
                }
                slow = slow.next;
                fast = fast.next.next;
            }
            return true;
        }

        public boolean hasCycle3(ListNode head) {
            ListNode slow = head, fast = head;
            while (fast != null) {
                fast = fast.next;
                if (fast != null) {
                    fast = fast.next;
                }
                if (fast == slow) {
                    return true;
                }
                slow = slow.next;
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}