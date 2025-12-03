package Java.src.com.DSA.Tree;

import java.util.ArrayList;
import java.util.List;

class BinaryTree_PreOrderNode {
    int data;
    BinaryTree_PreOrderNode left;
    BinaryTree_PreOrderNode right;

    public BinaryTree_PreOrderNode(int key) {
        data = key;
        left = null;
        right = null;

    }
}

public class BinaryTree_PreOrder {
    public static void preOrderTraversal(BinaryTree_PreOrderNode root, List<Integer> arr) {
        if (root == null) return;

        // Root
        arr.add(root.data);

        // Left
        preOrderTraversal(root.left, arr);

        // Right
        preOrderTraversal(root.right, arr);
    }

    public static List<Integer> preOrderTraversal(BinaryTree_PreOrderNode root) {
        List<Integer> arr = new ArrayList<>();

        // Call the preOrderTraversal function
        preOrderTraversal(root, arr);

        // Return the list containing preOrderTraversal values
        return arr;
    }

    public static void main(String[] args) {

        // Creating a sample binary tree
        BinaryTree_PreOrderNode root = new BinaryTree_PreOrderNode(1);
        root.left = new BinaryTree_PreOrderNode(2);
        root.right = new BinaryTree_PreOrderNode(3);
        root.left.left = new BinaryTree_PreOrderNode(4);
        root.left.right = new BinaryTree_PreOrderNode(5);

        // Getting preOrderTraversal values
        List<Integer> result = preOrderTraversal(root);

        System.out.println("Pre-order Traversal: ");

        for (int val : result) {
            System.out.print(val + " ");
        }

        System.out.println();
    }

}
