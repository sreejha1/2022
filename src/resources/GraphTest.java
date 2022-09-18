package resources;
import org.junit.Test;
import src.graph.Graph;

public class GraphTest {
    
    @Test
    public void printGraph(){
        Graph g = createDirectedGraph();
        g.dfs(0);
    }
    

    public Graph createDirectedGraph() {
        Graph graph = new Graph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addVertex(7);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 7);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);
        return graph;
    }
}
