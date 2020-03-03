/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        // if((head == null) || (head.next == null)){
        //     return head;
        // }
        // ListNode n = head.next;
        // head.next = swapPairs(head.next.next);//每一次都进行交换输出
        // n.next = head;
        // return n;//交换后的head
        // iterative version
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while (head != null && head.next != null) {//检查出口
            // pre->head->sec->tmp ==> pre->head->tmp->sec ==> pre->sec->head(pre)->tmp(head)
            ListNode sec = head.next; 
            head.next = sec.next;
            sec.next = head;
            pre.next = sec;
            pre = head;
            head = head.next;
        }
        return dummy.next;//每次都返回第一个节点

    }
}
// @lc code=end

