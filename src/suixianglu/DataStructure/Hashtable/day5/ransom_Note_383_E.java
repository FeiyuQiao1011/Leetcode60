package suixianglu.DataStructure.Hashtable.day5;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class ransom_Note_383_E {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] record = new int[26];

        for (char c : magazine.toCharArray()) {
            record[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            record[c - 'a']--;
        }

        for (int i : record){
            if(i < 0){
                return  false;
            }
        }
        return true;
    }
}
