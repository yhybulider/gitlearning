import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//Your runtime beats 88.04 % of java submissions
// Your memory usage beats 8.33 % of java submissions (39.9 MB)
// 递归思想去比较。每一次进行比较，直到
        // if (l1 == null) {
        //     return l2;
        // }
        // else if (l2 == null) {
        //     return l1;
        // }
        // else if (l1.val < l2.val ) {
        //     l1.next = mergeTwoLists(l1.next, l2);
        //     return l1;
        // }else   {
        //     l2.next = mergeTwoLists(l2.next, l1);
        //     return l2;
        // }
        // 方法二 迭代法
        // Your runtime beats 88.04 % of java submissions
        // Your memory usage beats 33.36 % of java submissions (39.1 MB)
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }

        }
        // 比较空链表的情况，直接将其结果返回在别的链表上c
        if (l1 != null) {
            cur.next = l1;
        } else {
            cur.next = l2;
        }

// 这里不理解，看多点数据结构的东西
        return dummy.next;


    }
}
// @lc code=end

