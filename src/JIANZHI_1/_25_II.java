package JIANZHI_1;

import java.util.Stack;

/**
 * 两数相加
 * 从末尾加
 * 逆序相加，用栈
 * @author 乔飞宇
 * @version 1.0
 */
public class _25_II {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //逆序问题，首先考虑能否用栈做
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        //注意这里的判断条件，别写成l1.next
        while (l1 != null){
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null){
            stack2.push(l2.val);
            l2 = l2.next;
        }
        //进位标志位
        int carry = 0;
        //每次造完都需要把ans也就是null连到尾节点
        ListNode ans = null;
        //这里考虑carry ！= 0
        //因为当栈1和栈2都空了之后，有可能还有进位，比如 5 + 5，进位1
        //需要继续进去造一个节点出来
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0){
            //这里如果写成stack1.pop() == null会有空指针异常
            int x = stack1.isEmpty() ? 0 : stack1.pop();
            int y = stack2.isEmpty() ? 0 : stack2.pop();
            int sum = x + y + carry;
            carry = sum / 10;
            sum %= 10;
            //造节点，连成链表
            ListNode currnode = new ListNode(sum);
            currnode.next = ans;
            ans = currnode;
        }
        return ans;
    }
}
