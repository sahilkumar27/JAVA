package Java.src.com.DSA.Tree;

import java.util.ArrayList;
import java.util.List;

class BinaryTree_PostOrderNode {
    int data;
    BinaryTree_PostOrderNode left;
    BinaryTree_PostOrderNode right;

    BinaryTree_PostOrderNode(int key){
        data = key;
        left = null;
        right = null;
    }
}


public class BinaryTree_PostOrder {

    public static void postOrderTraversal(BinaryTree_PostOrderNode root, List<Integer> arr){

        if(root==null) return;

        //Left
        postOrderTraversal(root.left, arr);

        // Right
        postOrderTraversal(root.right, arr);

        // Root
        arr.add(root.data);
    }


    public static List<Integer> postOrderTraversal(BinaryTree_PostOrderNode root){
        List<Integer> arr = new ArrayList<>();

        // Call the postOrderTraversal function
        postOrderTraversal(root, arr);

        // Return the list containing postOrderTraversal values
        return arr;
    }

    public static void main(String[] args) {
        BinaryTree_PostOrderNode root = new BinaryTree_PostOrderNode(1);
        root.left = new BinaryTree_PostOrderNode(2);
        root.right = new BinaryTree_PostOrderNode(3);
        root.left.left = new BinaryTree_PostOrderNode(4);
        root.left.right = new BinaryTree_PostOrderNode(5);

        List<Integer> result = postOrderTraversal(root);

        System.out.println("Post-order Traversal: ");

        for(int val : result){
            System.out.print(val + " ");
        }

        System.out.println();
    }
}
