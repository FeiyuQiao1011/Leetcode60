package JIANZHI_1;

import java.util.Stack;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int num : pushed){
            stack.push(num);
            while (!stack.isEmpty() && stack.peek() == popped[i]){
                i++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
