package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _18 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val == val){
            return head.next;
        }
        ListNode curr = head;
        ListNode pre = new ListNode(0);
        pre.next = curr;
        while (curr != null){
            if(curr.val == val){
                pre.next = curr.next;
                break;
            }
            curr = curr.next;
            pre = pre.next;
        }
        return head;
    }
}
