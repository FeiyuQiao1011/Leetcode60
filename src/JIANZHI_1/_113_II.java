package JIANZHI_1;

import java.util.*;

/**
 * @author 乔飞宇
 * @version 1.0
 */
public class _113_II {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //构建临接表
        List<Integer>[] adjacencyList = new List[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
        int[] inDegree = new int[numCourses];

        //根据先修关系构建临接表和入度数组
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prerequisiteCourse = prerequisite[1];
            adjacencyList[prerequisiteCourse].add(course);
            inDegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if(inDegree[i] == 0){
                queue.offer(i);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()){
            int course = queue.poll();
            result.add(course);

            for (Integer integer : adjacencyList[course]) {
                inDegree[integer]--;
                if(inDegree[integer] == 0){
                    queue.offer(integer);
                }
            }
        }

        if(result.size() != numCourses){
            return new int[0];
        }
        int[] res = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}
