
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/check-for-bst

public class Day89 {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        root.right.right = new Node(4);

        if (isBST(root))
            System.out.println("Is BST");
        else
            System.out.println("Not a BST");
    }
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    static boolean inorder(Node root, int prev[])
    {
        if(root==null)
        return true;
        
        if(!inorder(root.left,prev))
        return false;
        
        if(prev[0]>=root.data)
        return false;
        
        
        prev[0]=root.data;
        
        return inorder(root.right,prev);
    }
    // Function to check whether a Binary Tree is BST or not.
    static boolean isBST(Node root) {
        // code here.
        int prev[]={Integer.MIN_VALUE};
        
        return inorder(root,prev);
    }
}
