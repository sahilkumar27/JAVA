package Java.src.com.DSA.Tree;

import java.util.ArrayList;
import java.util.List;

class InOrderNode {
    int data;
    Node left;
    Node right;

    InOrderNode(int key) {
        data = key;
        left = null;
        right = null;
    }
}

public class BInaryTree_InorderTraversal {

    // Function to perform in-order traversal of the binary tree and store value in 'arr'
    public static void inOrderTraversal(Node root, List<Integer> arr) {
        if (root == null) {
            return;
        }
        // Left
        inOrderTraversal(root.left, arr);

        // Visit - Push the current node's data to the list
        arr.add(root.data);

        // Right
        inOrderTraversal(root.right, arr);
    }

    // Function to perform in-order traversal and return the result as a list
    public static List<Integer> inOrderTraversal(Node root) {
        // Create an empty list to store inorder traversal values
        List<Integer> arr = new ArrayList<>();

        // Call the inorder traversal function
        inOrderTraversal(root, arr);

        // Return the list containing inorder traversal values
        return arr;
    }

    public static void main(String[] args) {

        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting inOrderTraversal values
        List<Integer> result = inOrderTraversal(root);

        // Printing the inOrderTraversal values
        System.out.println("In-order Traversal: ");

        // Output each value in the inorder traversal
        for (int val : result) {
            System.out.print(val + " ");
        }

        System.out.println();
    }
}
