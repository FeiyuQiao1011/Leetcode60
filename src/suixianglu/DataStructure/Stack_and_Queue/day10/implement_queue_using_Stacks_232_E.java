package suixianglu.DataStructure.Stack_and_Queue.day10;

import java.util.Stack;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class implement_queue_using_Stacks_232_E {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;
    
    public void MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
        dumpstackIn();
        return stackOut.pop();
    }

    public int peek() {
        dumpstackIn();
        return stackOut.peek();
    }

    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
    
    private void dumpstackIn(){
        if(!stackOut.isEmpty()) return;
        while (!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }
    }
}
