package JIANZHI_1;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 栈做
 * 回文列表
 * 花了十秒钟想出来的，不知道之后会不会想不出来
 * @author 乔飞宇
 * @version 1.0
 */
public class _27_II {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> nodes = new Stack<>();
        ListNode cur = head;
        //入栈
        while (cur != null){
            nodes.push(cur);
            cur = cur.next;
        }
        while (head != null && !nodes.isEmpty()){
            cur = nodes.pop();
            if (cur.val != head.val){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
