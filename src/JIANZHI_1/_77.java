package JIANZHI_1;

import java.util.Stack;

/**
 * 链表排序
 * 给定链表，升序排列，返回头节点
 * 先快慢指针找到mid，也就相当于数组的归并排序找mid
 * 找到mid把链表砍断，归并排序
 * @author 乔飞宇
 * @version 1.0
 */
public class _77 {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        //找中间的mid
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left,right);
    }

    public ListNode merge(ListNode left, ListNode right){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (left != null && right != null){
            if(left.val < right.val){
                current.next = left;
                left = left.next;
            }else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if(left != null){
            current.next = left;
        }

        if(right != null){
            current.next = right;
        }
        return dummy.next;
    }
}
