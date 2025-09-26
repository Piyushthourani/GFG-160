
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/maximum-path-sum-from-any-node

public class Day87 {
    public static void main(String[] args) {
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println("Maximum path sum is: " + findMaxSum(root));
    }
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    static int findSum(Node root, int ans[]) {
        
        if(root==null)
        return 0;
        
        int l=Math.max(0,findSum(root.left,ans));
        int r=Math.max(0,findSum(root.right,ans));
        
        
        ans[0]=Math.max(ans[0], l+r+root.data);
        
        return root.data+Math.max(l,r);
    }
    // Function to return maximum path sum from any node in a tree.
    static int findMaxSum(Node node) {
        // your code goes here
        int ans[]={node.data};
        
        findSum(node,ans);
        return ans[0];
    }
}
