package suixianglu.DataStructure.String.day9;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class offer_58_II_E {
    public String reverseLeftWords(String s, int n) {
        char[] arr = s.toCharArray();
        char[] temp = new char[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        for (int i = n; i < arr.length; i++) {
            arr[k++] = arr[i];
        }
        for (int i = 0; i < n; i++){
            arr[k++] = temp[i];
        }
        return new String(arr);
    }
}
