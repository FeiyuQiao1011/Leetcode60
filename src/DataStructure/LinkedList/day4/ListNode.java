package DataStructure.LinkedList.day4;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class ListNode {
    //链表定义
    //节点值
    int val;

    //下一个节点
    ListNode next;

    //节点无参构造器
    public ListNode() {
    }

    //节点有参构造器

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
