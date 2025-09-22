
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/diameter-of-binary-tree

public class Day82 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int diameter = diameter(root);
        System.out.println("Diameter of the binary tree: " + diameter);
    }
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }    

    static int findDiameter(Node root, int ans[])
    {
        if(root==null)
        return 0;
        
        int lheight=findDiameter(root.left,ans);
        int rheight=findDiameter(root.right,ans);
        
        ans[0]=Math.max(ans[0],lheight+rheight);
        
        return 1+ Math.max(lheight,rheight);
    }
    
    
    static int diameter(Node root) {
        // Your code here
       int ans[]=new int[1];
       findDiameter(root,ans);
       return ans[0];
    }
        
}
