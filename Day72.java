
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/find-the-first-node-of-loop-in-linked-list--170645



public class Day72 {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next; // Creating a loop for testing

        Node loopNode = findFirstNode(head);
        if (loopNode != null) {
            System.out.println("First node of loop: " + loopNode.data);
        } else {
            System.out.println("No loop found");
        }
    }
    public static Node findFirstNode(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                slow=head;
                while(fast!=slow)
                {
                    fast=fast.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
