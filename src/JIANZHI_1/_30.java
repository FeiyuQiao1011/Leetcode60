package JIANZHI_1;

import java.util.Stack;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _30 {
    Stack<Integer> A;
    Stack<Integer> B;
    public void MinStack() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void push(int x) {
        A.push(x);
        if(B.isEmpty() || x <= B.peek()) B.push(x);
    }

    public void pop() {
        if(A.peek().equals(B.peek())){
            A.pop();
            B.pop();
        }else {
            A.pop();
        }
    }

    public int top() {
        return A.peek();
    }

    public int min() {
        return B.peek();
    }
}
