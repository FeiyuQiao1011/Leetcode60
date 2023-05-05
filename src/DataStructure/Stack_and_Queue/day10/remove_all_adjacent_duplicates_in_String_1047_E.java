package DataStructure.Stack_and_Queue.day10;

import java.util.ArrayDeque;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class remove_all_adjacent_duplicates_in_String_1047_E {
    public String removeDuplicates(String s) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (deque.isEmpty() || deque.peek() != ch){
                deque.push(ch);
            }else {
                deque.pop();
            }
        }
        String str = "";
        while (!deque.isEmpty()){
            str = deque.pop() + str;
        }
        return str;
    }
}
