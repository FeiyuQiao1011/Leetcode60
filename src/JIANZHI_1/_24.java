package JIANZHI_1;

/**
 * 递归做过,哑节点？双指针？
 * @author 乔飞宇
 * @version 1.0
 */
public class _24 {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head, pre = null;
        while (curr != null){
            ListNode temp = curr.next;
            pre = curr.next;
            pre = curr;
            curr = temp;
        }
        return pre;
    }
}
