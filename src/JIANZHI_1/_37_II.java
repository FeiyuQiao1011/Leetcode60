package JIANZHI_1;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 小行星碰撞
 * @author 乔飞宇
 * @version 1.0
 */
public class _37_II {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int asteroid : asteroids) {
            boolean alive = true;
            while (alive && asteroid < 0 && !stack.isEmpty() && stack.peek() > 0){
                alive = stack.peek() < -asteroid;
                if(stack.peek() <= -asteroid){
                    stack.pop();
                }
            }
            if(alive){
                stack.push(asteroid);
            }
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }
}
