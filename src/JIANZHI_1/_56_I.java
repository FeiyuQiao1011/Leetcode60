package JIANZHI_1;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 找出数组中两个只出现一次的数据
 *      哈希map？
 *      不行，要求时间复杂度O(N),空间复杂度O(1)
 *      异或！
 *          特点：两个相等的数经过异或运算等于0 a ⊕ b = 0
 *          流程：1.遍历数组，进行异或运算 x ^= num[i]
 *               2.循环左移计算m, m代表x 与 y不同的二进制位置---取决于异或的定义，异或结果是1的话，说明x与y的该位一定不同
 *               3.拆分nums为两个子数组，根据m与所有元素的按位与，肯定能把x和y分开
 *               4.分别遍历两个子数组执行异或，相当于简化问题，求每个字数组中有一个数字是只出现了一次
 * @author 乔飞宇
 * @version 1.0
 */
public class _56_I {
    public int[] singleNumbers(int[] nums) {
        int x = 0, y = 0, m = 1, n = 0;

        //x ⊕ y---两个不为零的数的异或结果
        for (int num : nums){
            n ^= num;
        }

        while ((n & m) == 0){
            m <<= 1;
        }

        for (int num : nums){
            if((num & m) != 0) x ^= num;
            else y ^= num;
        }
        return new int[] {x, y};
    }
}
