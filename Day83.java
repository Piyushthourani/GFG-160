
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/mirror-tree

public class Day83 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);

        System.out.println("Original Tree:");
        printInOrder(root);

        mirror(root);

        System.out.println("\nMirrored Tree:");
        printInOrder(root);
    }

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }

    static void mirror(Node root) {
        if(root==null)
        return ;
        
        mirror(root.left);
        mirror(root.right);
        
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
    }
}
