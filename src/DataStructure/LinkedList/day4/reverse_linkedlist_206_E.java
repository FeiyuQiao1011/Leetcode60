package DataStructure.LinkedList.day4;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class reverse_linkedlist_206_E {
    public ListNode reverseList(ListNode head) {
        //双指针法 + 虚节点
        ListNode pred = null;
        ListNode curr = head;
        ListNode temp = null;
        //
        while (curr != null){
            temp = curr.next;
            curr.next = pred;
            pred = curr;
            curr = temp;
        }
        return pred;
    }
}
