package leetcode;

/**
 * 重排列表
 * 栈
 * 第一步：找到链表中点，切断
 * 第二步：二分
 * @author 乔飞宇
 * @version 1.0
 */
public class _143_M {
    public void reorderList(ListNode head) {
        ListNode mid = findMidNode(head);
        ListNode l1 = head;
        ListNode l2 = mid.next;
        mid.next = null;
        l2 = reverse(l2);
        mergeSort(l1, l2);
    }

    public ListNode findMidNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode node){
        ListNode cur = node;
        ListNode pre = null;
        while (cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public void mergeSort(ListNode node1, ListNode node2){
        ListNode l1_temp;
        ListNode l2_temp;
        while (node1 != null && node2 != null){
            l1_temp = node1.next;
            l2_temp = node2.next;

            node1.next = node2;
            node1 = l1_temp;

            node2.next = node1;
            node2 = l2_temp;
        }
    }
}
