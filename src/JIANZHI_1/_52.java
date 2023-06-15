package JIANZHI_1;

/**
 * 两个链表的第一个公共节点
 *
 * @author 乔飞宇
 * @version 1.0
 */
public class _52 {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node1 = headA;
        ListNode node2 = headB;
        while (node1 != node2){
            node1 = node1 != null ? node1 : headA;
            node2 = node2 != null ? node2 : headB;
         }
        return node1;
    }
}
