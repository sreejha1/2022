package src.graph.djikstra;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class ShortestPathAlgo {
    public static LinkedList findShortestPath(Graph graph, GraphNode src){
        src.edgeDistance = 0;
        Set<GraphNode> unsettled = new HashSet<>();
        unsettled.add(src);
       // for(src.adjacentNodes)
        return null;
    }
    
    public GraphNode chooseClosestNeighbor(Set<GraphNode> unsettledNodes){
        return null;
    }
}
