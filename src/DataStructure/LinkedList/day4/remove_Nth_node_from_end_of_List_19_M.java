package DataStructure.LinkedList.day4;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class remove_Nth_node_from_end_of_List_19_M {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //虚拟头节点
        ListNode dummy = new ListNode(0,head);

        ListNode fastIndex = dummy;
        ListNode slowIndex = dummy;
        for (int i = 0; i < n; i++) {
            fastIndex = fastIndex.next;
        }
        while (fastIndex.next != null){
            slowIndex = slowIndex.next;
            fastIndex = fastIndex.next;
        }
        slowIndex.next = slowIndex.next.next;
        return dummy.next;
    }
}
