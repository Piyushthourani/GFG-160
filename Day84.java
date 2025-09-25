
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/construct-tree-1

import java.util.HashMap;

public class Day84 {
    public static void main(String[] args) {
        int[] inorder = {4, 2, 5, 1, 6, 3, 7};
        int[] preorder = {1, 2, 4, 5, 3, 6, 7};

        Node root = buildTree(inorder, preorder);
        System.out.println("Inorder traversal of the constructed tree:");
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
    public static Node buildTreeRec(HashMap<Integer,Integer> mp, int preorder[], int preindex[], int left,int right )
    {
        if(left>right)
        return null;
        
        int rootVal=preorder[preindex[0]];
        preindex[0]++;
        
        Node root=new Node(rootVal);
        int index=mp.get(rootVal);
        
        root.left=buildTreeRec(mp,preorder,preindex,left,index-1);
        root.right=buildTreeRec(mp,preorder,preindex,index+1,right);
        
        return root;
    }
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            mp.put(inorder[i],i);
        }
        int preindex[]={0};
        return buildTreeRec(mp,preorder,preindex, 0, inorder.length-1);
    }
    static void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }
}
