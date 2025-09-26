
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/boundary-traversal-of-binary-tree

import java.util.ArrayList;

public class Day86 {
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);

        System.out.println("Boundary traversal of the binary tree is:");
        System.out.println(boundaryTraversal(root));
    }
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    static boolean isLeaf(Node node)
    {
        return node.left==null && node.right==null;
    }
    
    static void collectBoundaryLeft(Node root, ArrayList<Integer> ans) {
        
        if(root==null || isLeaf(root))
        return ;
        
        ans.add(root.data);
        
        if(root.left!=null)
        collectBoundaryLeft(root.left,ans);
        else if(root.right!=null)
        collectBoundaryLeft(root.right,ans);
        
    }
    
    static void collectLeaves(Node root,ArrayList<Integer> ans) {
        
        if(root==null)
        return ;
        
        if(isLeaf(root))
        {
            ans.add(root.data);
            return;
        }
        
        collectLeaves(root.left,ans);
        collectLeaves(root.right,ans);
    }
    
    static void collectBoundaryRight(Node root, ArrayList<Integer> ans) {
        
        if(root==null || isLeaf(root))
        return ;
        
        
        if(root.right!=null)
        collectBoundaryRight(root.right,ans);
        else if(root.left!=null)
        collectBoundaryRight(root.left,ans);
        
        ans.add(root.data);
    }
    
    static ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        
        if(root==null)
        return ans;
        
        if(!isLeaf(root))
        ans.add(root.data);
        
        collectBoundaryLeft(root.left,ans);
        
        collectLeaves(root,ans);
        
        collectBoundaryRight(root.right,ans);
        
        return ans;
    }
}
