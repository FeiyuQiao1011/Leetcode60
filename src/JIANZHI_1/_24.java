package JIANZHI_1;

/**
 * 递归做过,哑节点？双指针？
 * @author 乔飞宇
 * @version 1.0
 */
public class _24 {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head, pre = null;
        while (cur != null){
            //暂存
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
