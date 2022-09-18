package src.graph;

import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> verticesMap;

    public Graph() {
        this.verticesMap = new HashMap<Integer, List<Integer>>();
    }

    public void addVertex(Integer vertex) {
        verticesMap.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(Integer vertex, Integer destinationVertex) {
        verticesMap.get(vertex).add(destinationVertex);
    }

    public void visit(Integer vertex) {
        System.out.println(vertex);
    }

    public void dfs(Integer source) {
        Set<Integer> isVisited = new HashSet(verticesMap.size());
        dfsRecursive(source, isVisited, null);
    }

    public void dfsRecursive(Integer currentNode, Set isVisited, Integer parent) {
        
        isVisited.add(currentNode);
        visit(currentNode);
        for (int dest : verticesMap.get(currentNode)) {
            if (!isVisited.contains(dest))
                dfsRecursive(dest, isVisited, currentNode);
            else {
                System.out.println(currentNode +" **");
                if (parent != currentNode)
                    System.out.println("THERE IS A CYCLE "+currentNode);
            }
        }
        
    }


    public Integer dfsRecursiveFindNumberOfNodesOnLevel(Integer currentNode, Set isVisited, Integer level) {
        List<Boolean> visited = new ArrayList<>(verticesMap.size());
        isVisited.add(currentNode);
        int count = 0;
        if(level == 0 )
            return count;
        visit(currentNode);
        for (int dest =0 ; dest < verticesMap.get(currentNode).size();dest++) {
            if (!isVisited.contains(dest))
                dfsRecursive(dest, isVisited, currentNode);
           
        }
        return count;
    }
}