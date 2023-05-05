package DataStructure.Stack_and_Queue.day10;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class implement_stack_using_Queues_225_E {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public void MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue2.offer(x);
        while (!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        Queue<Integer> queueTemp;
        queueTemp = queue1;
        queue1 = queue2;
        queue2 = queueTemp;
    }

    public int pop() {
        return queue1.poll();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
