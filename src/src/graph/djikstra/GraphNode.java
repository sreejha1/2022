package src.graph.djikstra;

import java.util.LinkedList;
import java.util.Map;

public class GraphNode {
    
    Integer edgeDistance = Integer.MAX_VALUE;;
    Map<GraphNode, Integer> adjacentNodes;
    LinkedList shortestPath = new LinkedList();
    String name;
    
    Map<GraphNode, Integer> addDestination(GraphNode node, Integer edgeDistance){
        adjacentNodes.put(node, edgeDistance);
        return adjacentNodes;
    }
    public GraphNode(String name) {
        this.name = name;
    }
}
