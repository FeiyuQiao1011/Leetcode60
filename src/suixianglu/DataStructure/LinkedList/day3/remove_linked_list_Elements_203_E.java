package suixianglu.DataStructure.LinkedList.day3;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class remove_linked_list_Elements_203_E {
    public ListNode removeElements(ListNode head, int val){
        //添加哑节点，保证操作一致性
        ListNode dummy = new ListNode(-1,head);

        //指针
        ListNode curr = head;
        ListNode pre = dummy;

        while (curr != null){
            if(curr.val != val){
                pre = curr;
            }else {
                pre.next = curr.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
