package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode pre = head;
        ListNode fast = head;
        int i = 0;
        while (true){
            fast = fast.next;
            i++;
            if(i == k) break;
        }

        while (fast != null){
            fast = fast.next;
            pre = pre.next;
        }
        return pre;
    }
}
