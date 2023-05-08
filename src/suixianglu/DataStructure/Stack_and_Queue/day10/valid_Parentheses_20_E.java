package suixianglu.DataStructure.Stack_and_Queue.day10;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class valid_Parentheses_20_E {
    public boolean isValid(String s) {
        Deque<Character> deque = new LinkedList<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if(ch == '('){
                deque.push(')');
            } else if (ch == '{') {
                deque.push('}');
            } else if (ch == '[') {
                deque.push(']');
            } else if (deque.isEmpty() || deque.peek() != ch) {
                return false;
            }else {
                deque.pop();
            }
        }
        return deque.isEmpty();
    }
}
