package src.linkedList;


import java.util.TreeSet;

class QNode {
        int key;
        QNode next;

        // constructor to create a new linked list node
        public QNode(int key)
        {
            this.key = key;
            this.next = null;
        }
    }
    class Queue {
        QNode front, rear;
        public void enqueue(int i) {
            QNode newNode = new QNode(i);
            if(rear != null)
              rear.next = newNode;
            //If queue is empty, front and rear are same;
            if(front == null)
                front = newNode;
            rear = newNode;
        }

        public void dequeue() {
            if(front != null) {
                this.front = this.front.next;
            }
            if (this.front == null)
                this.rear = null;
        }
        
    }


// The queue, front stores the front node of LL and rear stores the
// last node of LL
    public class QueueUsingLL {
        public static void main(String[] args)
        {
            Queue q = new Queue();
            q.enqueue(10);
            q.enqueue(20);
            q.dequeue();
            System.out.println("Afer deQueue1 Front : " + q.front.key);
            q.dequeue();
            q.enqueue(30);
            q.enqueue(40);
            q.enqueue(50);
             q.dequeue();
            System.out.println("Queue Front : " + q.front.key);
            System.out.println("Queue Rear : " + q.rear.key);
        }
    }
   

