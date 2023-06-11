package leetcode;

import org.junit.jupiter.api.Test;

/**
 * 思考加法计算的过程
 * 需要sum，是否进位
 * @author 乔飞宇
 * @version 1.0
 */
public class _2_M {
    @Test
    public void test(){
        System.out.println(10 / 10);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //新建节点，最后返回
        ListNode pre = new ListNode(0);
        ListNode curr = pre;
        int carry = 0;

        //循环
        while (l1 !=null || l2 != null){
            //取值
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;

            carry = sum / 10;
            sum = sum % 10;

            curr.next = new ListNode(sum);
            curr = curr.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            if(carry == 1){
                curr.next = new ListNode(carry);
            }
        }
        return pre.next;
    }
}
