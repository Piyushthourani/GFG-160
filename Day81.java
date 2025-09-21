
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/height-of-binary-tree

public class Day81 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int height = height(root);
        System.out.println("Height of the binary tree: " + height);
    }
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static int height(Node node) {
        if(node==null)
        return -1;
        
        int lh=height(node.left);
        int rh=height(node.right);
        
        return Math.max(lh,rh)+1;
    }
}
