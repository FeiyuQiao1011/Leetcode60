package JIANZHI_1;

import org.junit.jupiter.api.Test;

import java.util.Stack;

/**
 * 每日温度
 * 题解看了一眼：用栈做，有道理
 * 大体思想：栈不断网出弹。今天的天气需要用到后几天所有的天气，维护两个栈
 * 第一个栈：
 * 解：
 *      1.初始化：新建一个res数组，存放结果；维护一个单调递减的栈，存放temp数组的index值
 *      2.循环遍历：
 * @author 乔飞宇
 * @version 1.0
 */
public class _38_II {

    @Test
    public void test(){
        int[] nums = {73,74,75,71,69,72,76,73};
        dailyTemperatures(nums);
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        //单调递减的stack
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                res[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return res;
    }
}
