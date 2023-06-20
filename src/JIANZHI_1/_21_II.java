package JIANZHI_1;

/**
 * 删除链表的倒数第n个节点
 * 快慢指针
 * slow指向倒数n - 1个， fast指向末尾
 * @author 乔飞宇
 * @version 1.0
 */
public class _21_II {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode slow = dummy;
        ListNode fast = head;
        while (n > 0){
            fast = fast.next;
            n--;
        }
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
