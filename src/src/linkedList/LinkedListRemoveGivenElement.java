package src.linkedList;

import java.util.Arrays;
import java.util.List;


class LinkedList2 {
    List<Node2> nodes;
    Node2 head;

    LinkedList2(Node2 head, List<Node2> nodes) {
        this.head = head;
        this.nodes = nodes;
    }
}

class Node2 {
    Node2 next2;
    int key;

    Node2(int i, Node2 n) {
        this.key = i;
        this.next2 = n;
    }
}

public class LinkedListRemoveGivenElement {
    public static void main(String args[]) {
        LinkedList2 ln =  createLL();
        System.out.println("Head.next before removal" +ln.head.next2.key);
        boolean afterRemoval = removeElement(2, ln);
        System.out.println("Head.next after removal" +ln.head.next2.key);
    }

    // 3-> 2->1
    public static LinkedList2 createLL() {
        Node2 one = new Node2(1, null);
        Node2 two = new Node2(2, one);
        Node2 three = new Node2(3, two);
        // one.next2 = two;
        System.out.println("elements 3: " + three.key + " " + three.next2.key);
        System.out.println("elements 2: " + two.key + " " + two.next2.key);
//        System.out.println("elements 1: " + one.key + " " + one.next2.key);
        return new LinkedList2(three, Arrays.asList(one, two, three));
    }

    public static boolean removeElement(int n, LinkedList2 linkedList) {
        Node2 head = linkedList.head;
        Node2 currentNode = linkedList.head;
        Node2 parentNode = null;
        if(head == null){
           //return error;
            return false;
        }
        
        while(currentNode.next2 != null){
            if(n == currentNode.key){
                if(parentNode != null){
                    parentNode.next2 = currentNode.next2;
                }
                else{
                    //Removes head
                    head = currentNode.next2;
                    
                }
                return true;
            }
            parentNode = currentNode;
            currentNode = currentNode.next2;
        }
        
         return false;
    }

}