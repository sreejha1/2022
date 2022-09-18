package src.linkedList;

import java.util.Arrays;
import java.util.List;
/*https://leetcode.com/problems/linked-list-cycle/
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
 */
class LinkedList{
    List <Node> nodes;
    Node head;
    LinkedList(Node head, List<Node> nodes){
        this.head = head;
        this.nodes = nodes;
    }
    
}
 class Node{
    int key;
    Node next;
    Node(int key, Node n){
        this.key = key;
        this.next = n;
    }
}

public class LinkedListCycle {
    /* Create a linked list with 3 -> 2 -> 1
                                      | ----|
     */
    public static void main(String args[]) {
        Node one = new Node(1, null);
        Node two = new Node(2, one);
        Node three = new Node(3, two);
       // one.next = two;
        System.out.println("elements 3: " + three.key + " " + three.next.key);
        System.out.println("elements 2: " + two.key + " " + two.next.key);
//        System.out.println("elements 1: " + one.key + " " + one.next.key);
        LinkedList l = new LinkedList(three, Arrays.asList(one,two, three));
        System.out.println(isCycle(l));
    }

   static boolean isCycle(LinkedList l) {
        //Have 2 pointer
        Node fast = l.head;
        Node slow = l.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow)
                return true;
        }
        return false;
    }
}
