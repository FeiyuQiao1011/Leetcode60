package suixianglu.DataStructure.LinkedList.day4;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class swap_nodes_in_Pairs_24_M {
    public ListNode swapPairs(ListNode head) {
        //虚节点
        ListNode dummy = new ListNode(-1,head);
        ListNode curr = dummy;
        dummy.next = head;
        ListNode temp;
        ListNode firstNode;
        ListNode secondNode;

        while (curr.next != null && curr.next.next != null){
            //
            temp = curr.next.next.next;
            firstNode = curr.next;
            secondNode = curr.next.next;
            curr.next = secondNode;
            secondNode.next = firstNode;
            firstNode.next = temp;
            //
            curr = firstNode;
        }
        return dummy.next;
    }
}
