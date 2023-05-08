package JIANZHI_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 倒序打印链表，数组输出
 * ?数组大小怎么取
 * @author 乔飞宇
 * @version 1.0
 */
public class _06 {
    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> stack = new LinkedList<>();
        while (head != null){
            stack.add(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.removeLast();
        }
        return res;
    }
}
