
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/k-sum-paths

import java.util.HashMap;

public class Day88 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(-1);
        root.left.left = new Node(2);
        root.left.right = new Node(1);
        root.left.right.left = new Node(1);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        root.right.right.right = new Node(6);

        int k = 5;
        System.out.println("Number of paths with sum " + k + " is: " + sumK(root, k));
    }
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public static int countPaths(Node root,int k, int currsum, HashMap<Integer,Integer> prefsum)
    {
        if(root==null)
         return 0;
         
        int pathCount=0;
        currsum += root.data;
        
        if(currsum==k)
        pathCount++;
        
        pathCount += prefsum.getOrDefault(currsum-k,0);
        
        prefsum.put(currsum, prefsum.getOrDefault(currsum,0)+1);
        
        pathCount += countPaths(root.left, k, currsum, prefsum);
        pathCount += countPaths(root.right, k, currsum, prefsum);
        
        prefsum.put(currsum, prefsum.get(currsum)-1);
        
        return pathCount;
        
        
    }
    
    public static int sumK(Node root, int k) {
        // code here
        HashMap<Integer,Integer> prefsum=new HashMap<>();
        
        return countPaths(root,k,0,prefsum);
    }
}
