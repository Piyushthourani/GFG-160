
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/add-two-numbers-represented-by-linked-lists



public class Day69 {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node num1 = new Node(2);
        Node head1=num1;
        num1.next = new Node(4);
        num1.next.next = new Node(3);

        Node num2 = new Node(5);
        Node head2=num2;
        num2.next = new Node(6);
        num2.next.next = new Node(4);
        System.out.print("first number: ");
        while (num1 != null) {
            System.out.print(num1.data + " ");
            num1 = num1.next;
        }
        System.out.println();
        System.out.print("second number: ");
        while (num2 != null) {
            System.out.print(num2.data + " ");
            num2 = num2.next;
        }
        System.out.println();

        Node result = addTwoLists(head1, head2);
        
        
        System.out.print("sum: ");
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        Node ans=null;
        Node curr=null;
        int carry=0;
        
        num1=trimzeros(num1);
        num2=trimzeros(num2);
        
        num1=reverse(num1);
        num2=reverse(num2);
        
        while(num1!=null || num2!=null ||carry!=0)
        {
            int sum=carry;
            if(num1!=null)
            {
                sum+=num1.data;
                num1=num1.next;
            }
            if(num2!=null)
            {
                sum+=num2.data;
                num2=num2.next;
            }
            Node newnode=new Node(sum%10);
            carry=sum/10;
            
            if(ans==null)
            {
                ans=newnode;
                curr=newnode;
            }
            else
            {
                curr.next=newnode;
                curr=curr.next;
            }
        }
        
        return reverse(ans);
    }
    static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node next;
        
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    
    static Node trimzeros(Node head){
        while(head!=null && head.data==0)
        {
            head=head.next;
        }
        return head;
    }
}
