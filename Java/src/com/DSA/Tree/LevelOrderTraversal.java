package Java.src.com.DSA.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    // Node class for the binary tree
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Function to perform level order traversal
    public static void levelOrderTraversal(Node root) {
        if (root == null) return;   // If the tree is empty do nothing

        Queue<Node> queue = new LinkedList<>();     // Create a queue to hold nodes at each level
        queue.add(root);        // Start with the root node

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();    // poll () removes and returns the head of the queue
            System.out.print(currentNode.data + " ");       // Process the current node

            // Add left child to the queue if it exists
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }

            // Add right child to the queue if it exists
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Level Order Traversal:");
        levelOrderTraversal(root);
    }
}
