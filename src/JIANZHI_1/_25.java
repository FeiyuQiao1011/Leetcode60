package JIANZHI_1;

/**
 * 哑节点
 * @author 乔飞宇
 * @version 1.0
 */
public class _25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0), dum = node;
        while (l1 != null && l2 != null){
            if(l1.val >= l2.val) {
                node.next = l2;
                l2 = l2.next;
            }
            else {
                node.next = l1;
                l1 = l1.next;
            }
            node = node.next;
        }
        node.next = l1 != null ? l1 : l2;
        return dum.next;
    }
}
