package DataStructure.String.day9;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class find_the_index_of_the_first_occurrence_in_a_String_28_M {
    public int strStr(String haystack, String needle) {
        int[] next = new int[needle.length()];
        getNext(next, needle);
        int j = -1;
        for (int i = 0; i < haystack.length(); i++) {
            while (j >= 0 && haystack.charAt(i) != needle.charAt(j + 1)){
                j = next[j];
            }
            if(haystack.charAt(i) == needle.charAt(j + 1)){
                j++;
            }
            if(j == needle.length() - 1){
                return (i - needle.length() + 1);
            }
        }
        return -1;
    }

    public void getNext(int[] next, String needle){
        int j = 0;
        next[0] = 0;
        for (int i = 1; i < needle.length(); i++) {
            while (j > 0 && needle.charAt(i) != needle.charAt(j)){
                j = next[j - 1];
            }
            if (needle.charAt(i) == needle.charAt(j)){
                j++;
            }
            next[i] = j;
        }
    }
}
