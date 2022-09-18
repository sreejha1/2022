package src.tree;

import java.util.List;

public class BinaryTree {
    Node root;
    List<Node> nodes;
    
    public BinaryTree() {
    }

    public BinaryTree(Node root, List<Node> nodes) {
        this.root = root;
        this.nodes = nodes;
    }
    public void add(int val){
      root =  add(val, root);
    }
    public Boolean isEmpty(){
       return root == null;
    }
    public boolean containsNode(int val){
        return containsRecursive(root, val);
    }

    public boolean containsRecursive(Node currentNode, int val){
        //We have reached the end of the tree and the element was not found.
        if(currentNode == null)
            return false;
        
        if (val == currentNode.val) {
            return true;
        }
        if(val < currentNode.val)
            return  containsRecursive(currentNode.left, val);
        else if(val > currentNode.val)
           return containsRecursive(currentNode.right, val);
        
         return false;   
    }
    
    public int getSize(){
        return getSizeRecursive(root);
        
    }

    public int getSizeRecursive(Node currentNode){
        if(currentNode == null)
            return 0;
        return getSizeRecursive(currentNode.left)+1+getSizeRecursive(currentNode.right);

    }
    
    public Node add(int val, Node n){
        if(n == null){
            return new Node( val);
        }
        if(val > n.val)
           n.right = add(val, n.right);
        else if(val < n.val)
           n.left =  add(val, n.left);
        return n;
        
    }

    public class Node{
        Node right;
        Node left;
        int val;

        public Node(Node right, Node left, int val) {
            this.right = right;
            this.left = left;
            this.val = val;
        }

        public Node(int val) {
            this.val = val;
            this.right=null;
            this.left = null;
        }
    }
}
