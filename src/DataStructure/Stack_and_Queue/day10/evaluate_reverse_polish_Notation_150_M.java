package DataStructure.Stack_and_Queue.day10;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class evaluate_reverse_polish_Notation_150_M {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        for (String s : tokens){
            if("+".equals(s)){
                stack.push(stack.pop() + stack.pop());
            } else if ("-".equals(s)) {
                stack.push(-stack.pop() + stack.pop());
            } else if ("*".equals(s)) {
                stack.push(stack.pop() * stack.pop());
            } else if ("/".equals(s)) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 / temp1);
            }else {
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();
    }
}
