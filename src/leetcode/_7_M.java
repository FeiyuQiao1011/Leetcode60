package leetcode;

/**
 * 整数反转
 * 假设环境不允许存储 64 位整数（有符号或无符号）
 * @author 乔飞宇
 * @version 1.0
 */
public class _7_M {
    public int reverse(int x) {
        int res = 0;
        while (x != 0){
            int temp = x % 10;
            //每次循环判断他是不是大于了最大的数
            if(res > 214748364 || (res==214748364 && temp>7)){
                return 0;
            }
            if (res<-214748364 || (res==-214748364 && temp<-8)) {
                return 0;
            }
            res = res * 10 + temp;
            x /= 10;
        }
        return res;
    }
}
