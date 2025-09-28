
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/find-a-pair-with-given-target-in-bst

import java.util.HashSet;

public class Day91 {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.left.left.left = new Node(1);
        int target=9;
        System.out.println(findTarget(root,target));
    }
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    static boolean pairsum(Node root, HashSet<Integer> hs, int target)
    {
        if(root==null)
        return false;
        
        if(hs.contains(target-root.data))
        return true;
        
        hs.add(root.data);
        
        return pairsum(root.left,hs,target) || pairsum(root.right,hs,target);
    }
    static boolean findTarget(Node root, int target) {
        // Write your code here
        HashSet<Integer> hs=new HashSet<>();
        return pairsum(root,hs,target);
    }
}
