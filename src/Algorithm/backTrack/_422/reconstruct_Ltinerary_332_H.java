package Algorithm.backTrack._422;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class reconstruct_Ltinerary_332_H {
    ArrayList<String> res = new ArrayList<>();
    public List<String> findItinerary(List<List<String>> tickets) {
        boolean[] used = new boolean[tickets.size()];
        backTrack(tickets,used);
        return res;
    }

    public void backTrack(List<List<String>> tickets, boolean[] used){
        //if()
    }
}
