
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/level-order-traversal

import java.util.ArrayList;

public class Day80 {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Level Order Traversal:");
        System.out.println(levelOrder(root));
    }
    public static void levelOrderRec(Node root, int level, ArrayList<ArrayList<Integer>> ans)
    {
        if(root==null)
        return;
        
        if(ans.size()<=level)
        ans.add(new ArrayList<>());
        
        ans.get(level).add(root.data);
        
        levelOrderRec(root.left,level+1, ans);
        levelOrderRec(root.right, level+1, ans);
        
        
    }
    
    public static ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        levelOrderRec(root,0,ans);
        return ans;
    }
}
