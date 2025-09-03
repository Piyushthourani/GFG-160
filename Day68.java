
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/reverse-a-linked-list-in-groups-of-given-size


public class Day68 {
    public static class Node {
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
        head.next.next.next.next = new Node(5);
        int k = 2;
        head = reverseKGroup(head, k);
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static Node reverseKGroup(Node head, int k) {
        // code here
        
        
        Node temp=new Node(0);
        temp.next=head;
        Node prevtail=temp;
        Node curr=head;
        
        
        while(curr!=null)
        {
            Node grouphead=curr;
            int count=0;
            while(count<k && curr!=null)
            {
                curr=curr.next;
                count++;
            }
            if(count>0)
            {
                Node nextgrouphead=curr;
                Node reversed=reverseKnodes(grouphead,count);
                prevtail.next=reversed;
                prevtail=grouphead;
                grouphead.next=nextgrouphead;
                curr=nextgrouphead;
            }
        }
        return temp.next;
    }
    public static Node reverseKnodes(Node head,int k){
        Node prev=null;
        Node curr=head;
        while(k-- > 0 && curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
