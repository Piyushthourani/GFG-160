
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/merge-two-sorted-linked-lists

import java.util.ArrayList;


public class Day67 {
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
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        Node mergedHead = sortedMerge(head1, head2);
        printList(mergedHead);
    }
    public static Node sortedMerge(Node head1, Node head2) {
        // code here
        ArrayList<Integer> li=new ArrayList<>();
        while(head1!=null && head2!=null)
        {
            if(head1.data<=head2.data)
            {
                li.add(head1.data);
                head1=head1.next;
            }
            else
            {
                li.add(head2.data);
                head2=head2.next;
            }
        }
        if(head1==null)
        {
            while(head2!=null)
            {
                li.add(head2.data);
                head2=head2.next;
            }
        }
        else if(head2==null)
        {
            while(head1!=null)
            {
                li.add(head1.data);
                head1=head1.next;
            }
        }
        Node newnode=new Node(li.get(0));
        Node curr=newnode;
        for(int i=1;i<li.size();i++)
        {
            Node temp=new Node(li.get(i));
            temp.next=null;
            curr.next=temp;
            curr=curr.next;
        }
        return newnode;
    }

}
