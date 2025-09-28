
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/find-k-th-smallest-element-in-bst

public class Day90 {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.left.left.left = new Node(1);
        int k=3;
        System.out.println(kthSmallest(root,k));
    }
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public static int kthSmallestRec(Node root,int cnt[], int k)
    {
        if(root==null)
        return -1;
        
        int left=kthSmallestRec(root.left,cnt,k);
        
        if(left!=-1)
        return left;
        
        cnt[0]++;
        
        if(cnt[0]==k)
        return root.data;
        
        int right=kthSmallestRec(root.right,cnt,k);
        return right;
    }
    // Return the Kth smallest element in the given BST
    public static int kthSmallest(Node root, int k) {
        // Write your code here
        int cnt[]={0};
        return kthSmallestRec(root,cnt,k);
    }
}