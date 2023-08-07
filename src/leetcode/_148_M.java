package leetcode;

/**
 * 返回排序链表
 *
 * @author 乔飞宇
 * @version 1.0
 */
public class _148_M {
    public ListNode sortList(ListNode head) {
        ListNode mid = findMid(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        ListNode sortedLeft = sortList(left);
        ListNode sortedRight = sortList(right);

        return merge(sortedLeft, sortedRight);
    }

    public ListNode findMid(ListNode node){
        ListNode slow = node;
        ListNode fast = node;
        while (slow.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode merge(ListNode n1, ListNode n2){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (n1.next != null && n2.next != null){
            if(n1.val >= n2.val){
                current.next = n2;
                n2 = n2.next;
            }else {
                current.next = n1;
                n1 = n1.next;
            }
            current = current.next;
        }

        if (n1.next != null){
            current.next = n1;
        }

        if (n2 != null){
            current.next = n2;
        }
        return dummy.next;
    }
}
