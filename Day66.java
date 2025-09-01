
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/rotate-a-linked-list


public class Day66 {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // Example usage
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 2; // Number of rotations

        Day66 solution = new Day66();
        Node rotatedHead = solution.rotate(head, k);

        // Print the rotated linked list
        printList(rotatedHead);
    }
    
    public Node rotate(Node head, int k) {
        // add code here
        Node curr=head;
        if(k==0 || head==null)
        return head;
        
        int len=1;
        while(curr.next!=null)
        {
            curr=curr.next;
            len++;
        }
        k%=len;
        if(k==0)
        return head;
        
        curr.next=head;
        
        curr=head;
        
        for(int i=1;i<k;i++)
        {
            curr=curr.next;
            
        }
        head=curr.next;
        curr.next=null;
        return head;
        
    }
}
