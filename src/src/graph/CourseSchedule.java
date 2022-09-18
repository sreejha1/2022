package src.graph;

import java.util.*;

public class CourseSchedule {
    class CourseScheduleGraph {
        Map<Integer, List<Integer>> mapOfNeighbors;

        CourseScheduleGraph() {
            mapOfNeighbors = new HashMap<Integer, List<Integer>>();

        }

        public void addEdge(Integer src, Integer destination) {
            mapOfNeighbors.get(src).add(destination);
        }

        public void addVertex(Integer src) {
            mapOfNeighbors.putIfAbsent(src, new ArrayList<>());
        }

    }

    class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            CourseScheduleGraph graph = createDirectedGraph(prerequisites);
            boolean ok = canFinish(prerequisites[0][0], new HashSet<>(), graph);

            return false;
        }

        public boolean canFinish(Integer src, Set<Integer> visited, CourseScheduleGraph graph) {
            visited.add(src);
            
            for(Integer s: graph.mapOfNeighbors.get(src)){
                if(!visited.contains(s)){
                    canFinish(s, visited, graph);
                }
                else{
                    return false;
                }
            }
                return true;
        }

        /**
         * [1,0]
         * [2,3]
         *
         * @param prerequisites
         * @return
         */
        public CourseScheduleGraph createDirectedGraph(int[][] prerequisites) {
            CourseScheduleGraph graph = new CourseScheduleGraph();
            for (int row = 0; row < prerequisites.length; row++) {
                for (int col = 0; col < prerequisites.length; col++) {
                    graph.addVertex(prerequisites[row][col]);
                }
                graph.addEdge(prerequisites[row][0], prerequisites[row][1]);
            }
            return graph;

        }
    }
}
