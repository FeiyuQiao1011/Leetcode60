package suixianglu.DataStructure.LinkedList.day4;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class intersection_of_two_LinkedLists_0207_E {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB){
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
