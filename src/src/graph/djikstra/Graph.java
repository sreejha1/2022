package src.graph.djikstra;

import java.util.List;
import java.util.Set;

public class Graph {
    Set<GraphNode> nodes;
    
    public void addNode(GraphNode nodeA) {
        nodes.add(nodeA);
    }
}
