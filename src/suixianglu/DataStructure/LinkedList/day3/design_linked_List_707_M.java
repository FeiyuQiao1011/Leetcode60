package suixianglu.DataStructure.LinkedList.day3;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class design_linked_List_707_M {

    int size;
    ListNode head;

    //链表初始化
    public void MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    //获取第index节点的数值
    public int get(int index) {
        ListNode curr = head;
        for (int i = 0; i <= index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    //头部添加节点
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    //尾部添加节点
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }

        //扩容
        size++;

        //前驱节点
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }

        ListNode toAdd = new ListNode(val);
        toAdd.next = pred.next;
        pred.next = toAdd;
    }

    public void deleteAtIndex(int index) {
        //减容
        size--;

        //前驱
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        pred.next = pred.next.next;
    }
}
