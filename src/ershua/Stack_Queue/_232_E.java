package ershua.Stack_Queue;

import java.util.Stack;

/**
 * 用栈实现队列
 * 用两个栈实现先入先出队列
 * 解：
 *      两个栈，一个入栈stackIn，一个出栈stackOut
 *      
 * @author 乔飞宇
 * @version 1.0
 */
public class _232_E {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;
    public _232_E() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
        dumpStackIn();
        return stackOut.pop();
    }

    public int peek() {
        dumpStackIn();
        return stackOut.peek();
    }

    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }

    //如果stackOut为空，那么stackIn中的元素全部放到stackOut里
    private void dumpStackIn(){
        if(!stackOut.isEmpty()) return;
        while (!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }
    }
}
