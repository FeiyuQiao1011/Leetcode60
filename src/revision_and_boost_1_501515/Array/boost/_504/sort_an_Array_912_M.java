package revision_and_boost_1_501515.Array.boost._504;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class sort_an_Array_912_M {
    int[] temp;
    /**
     * 归并排序
     * @param nums
     * @return
     */
    public int[] mergeSort(int[] nums){
        temp = new int[nums.length];
        mergeSort1(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort1(int[] nums, int l, int r){
        if(l >= r) return;

        int mid = (l + r) >> 1;
        mergeSort1(nums, l, mid);
        mergeSort1(nums, mid + 1, r);
        int i = l, j = mid + 1;
        int cnt = 0;
        while (i <= mid && j <= r){
            if(nums[i] <= nums[j]){
                temp[cnt++] = nums[i++];
            }else {
                temp[cnt++] = nums[j++];
            }
        }
        while (i <= mid){
            temp[cnt++] = nums[i++];
        }
        while (j <= r){
            temp[cnt++] = nums[j++];
        }
        for (int k = 0; k < r - l + 1; k++) {
            nums[k + 1] = temp[k];
        }
    }

    /**
     * 快排
     * 1.确定分界点
     * 2.把整个区间分为两半 左边 <= x
     * 3.递归处理左右两边
     */
    public void quickSort(int[] nums, int left, int right){
        if(left < right){
            int pivoIndex = partition(nums, left, right);
            quickSort(nums, left, pivoIndex - 1);
            quickSort(nums, pivoIndex + 1, right);
        }
    }

    public static int partition(int[] nums, int left, int right){
        int pivot = nums[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if(nums[j] < pivot){
                i++;
            }
        }
        //swap(nums, i + 1, right);
        return i + 1;
    }

    public void merge_Sort(int[] nums, int l, int r){
        if(l >= r) return;
        int mid = l + (r - l) >> 1;
        merge_Sort(nums, l, mid);
        merge_Sort(nums, mid + 1, r);
        int k = 0, i = l, j = mid + 1;
        while(i <= mid && j <= r){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
            }
        }
        while(i <= mid){
            temp[k++] = nums[i++];
        }
        while(j <= r){
            temp[k++] = nums[j++];
        }
        for(i = 1, j = 0; i <= r; i++, j++){
            nums[i] = temp[j];
        }
    }
}
