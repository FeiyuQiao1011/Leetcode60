package JIANZHI_1;

/**
 * 排序数组中和为target的下标
 * 双指针做
 * @author 乔飞宇
 * @version 1.0
 */
public class _006_II {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int sum = 0;
        while (left < right){
            sum = numbers[left] + numbers[right];
            if(sum > target){
                right--;
            } else if (sum < target) {
                left++;
            }else {
                break;
            }
        }
        return new int[]{left,right};
    }
}
