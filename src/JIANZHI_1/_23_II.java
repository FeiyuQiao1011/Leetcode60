package JIANZHI_1;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _23_II {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node = headA;
        ListNode node1 = headB;
        while (node1 != node){
            node = node == null ? headA : node.next;
            node1 = node1 == null ? headB : node1.next;

        }
        return node;
    }
}
