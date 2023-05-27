package JIANZHI_1;

/**
 * 重排链表
 *  想法：
 *      1.首先遍历取到尾节点
 *      2.用类似归并的方法，双指针，前向后，后向前，直到两个指针相遇？
 *      ListNode start = head;
 *         ListNode end;
 *         ListNode curr = head;
 *         //什么时候用curr.next，什么时候用curr？
 *         //此时必须curr.next,因为curr != null循环的话，跳出循环的时候curr是null，没办法取到尾节点。
 *         while (curr.next != null){
 *             curr = curr.next;
 *         }
 *         end = curr;
 *  不行，单链表，没有former，尾节点没办法向前遍历。
 *
 *  解：
 *      1.寻找链表中点
 *          快慢指针
 *          快指针走两步，慢指针走一步
 *          1 -> 2 -> 3 -> 4 -> 5 -> null
 *      2.将中点右半端反转
 *      3.合并左右
 * @author 乔飞宇
 * @version 1.0
 */
public class _II_26 {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        //寻找中点
        ListNode mid = middleNode(head);

        ListNode l1 = head;
        ListNode l2 = mid.next;

        //分开两段
        mid.next = null;

        //反转后半段
        l2 = reverseList(l2);

        //归并
        mergeList(l1,l2);
    }

    //寻找链表中点，偶数个的话不是中点，不过不影响
    public ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        //这个是控制节点是奇数个还是偶数个
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //反转链表
    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null){
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }

    public void mergeList(ListNode node1, ListNode node2){
        ListNode node1_temp;
        ListNode node2_temp;

        while (node1 != null && node2!= null){
            //动之前保护后续节点
            node1_temp = node1.next;
            node2_temp = node2.next;

            //动
            node1.next = node2;
            node1 = node1_temp;

            node2.next = node1;
            node2 = node2_temp;
        }
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */