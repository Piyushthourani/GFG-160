
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/clone-a-linked-list-with-next-and-random-pointer

import java.util.HashMap;
import java.util.Map;



public class Day70 {
    public static class Node {
        int data;
        Node next, random;
        Node(int data) {
            this.data = data;
            this.next = this.random = null;
        }
    }
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            int randomData = (curr.random != null) ? curr.random.data : -1;
            System.out.println("Node data: " + curr.data + ", Random points to: " + randomData);
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.random = head.next.next; // 1's random points to 3
        head.next.random = head; // 2's random points to 1
        head.next.next.random = head.next; // 3's random points to 2

        Node clonedList = cloneLinkedList(head);

        System.out.println("Original list:");
        printList(head);
        System.out.println("Cloned list:");
        printList(clonedList);
    }
    public static Node cloneLinkedList(Node head) {
        // code here
        Map<Node,Node> mp=new HashMap<>();
        Node curr=head;
        
        while(curr!=null)
        {
            mp.put(curr,new Node(curr.data));
            curr=curr.next;
        }
        curr=head;
        while(curr!=null)
        {
            Node newnode=mp.get(curr);
            newnode.next=mp.get(curr.next);
            
            newnode.random=mp.get(curr.random);
            
            curr=curr.next;
        }
        return mp.get(head);
    }
}
