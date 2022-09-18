package src.linkedList;

import java.util.Arrays;
import java.util.List;

/*https://leetcode.com/problems/remove-nth-node-from-end-of-list/

Given the head of a linked list, remove the nth node from the end of the list and return its head.

A one pass solution can be done using pointers. 
1. Move one pointer fast --> n+1 places forward, to maintain a gap of n between the two pointers 
2. then move both at the same speed. Finally, when the fast pointer reaches the end, the slow pointer will be n+1 places behind -
 just the right spot for it to be able to skip the next node.

Since the question gives that n is valid, not too many checks have to be put in place. Otherwise, this would be necessary.
 */
class SingleLinkedList {
    List<SingleNode> nodes;
    SingleNode n;

    public SingleLinkedList(List<SingleNode> nodes, SingleNode n) {
        this.nodes = nodes;
        this.n = n;
    }
}

class SingleNode {
    int num;
    SingleNode next;

    public SingleNode(int num, SingleNode next) {
        this.num = num;
        this.next = next;
    }
}

public class RemoventhNodeFromEnd {
    public static void main(String args[]) {
        //6->5->4 -> 3 -> 2 -> 1  ->null
    
      
        Node one = new Node(1, null);
        Node two = new Node(2, one);
        Node three = new Node(3, two);
        Node four = new Node(4, three);
        Node five = new Node(5, four);
        Node six = new Node(6, five);
        
        System.out.println("elements 3: " + three.key + " " + three.next.key);
        System.out.println("elements 2: " + two.key + " " + two.next.key);
        System.out.println("elements 4: " + four.key + " " + four.next.key);
        LinkedList l = new LinkedList(six, Arrays.asList(one,two, three, four,five,six));
        System.out.println(removeNodeFromEnd(2, l));
        System.out.println("elements 3 after removal: " + three.key + " " + three.next.key);
    }

    private static boolean removeNodeFromEnd(int m, LinkedList l) {
        //Find the length of the list
        Node currentnode = l.head;
        int length = 1;
        while(currentnode.next != null){
            length++;
            currentnode = currentnode.next;
        }
        System.out.println("The length of list is "+length);
        Node node = l.head;
        //len -n -1 give the parent node the nth node we are lookiing for.
       for(int i =1 ; i< (length-m); i++){
          node = node.next;
       }
        System.out.println(node.key);
       node.next = node.next.next;
        return false;
    }

}
