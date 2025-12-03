package Java.src.com.DSA.Tree;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int key) {
        data = key;
        left = null;
        right = null;
    }
}

public class BinaryTreeRepresentation {
    public static void main(String[] args) {
        // Creating a binary tree
        // Create a root note with a key value 1
        Node root = new Node(1);

        // Create a left node with a key value 5
        root.left = new Node(5);

        // Create a right node with a key value 15
        root.right = new Node(15);

        // Create left and right children for the left node
        root.left.left = new Node(20);
        root.left.right = new Node(25);

        // Create a left child for the right node
        root.right.left = new Node(30);

        System.out.println("Root Node: " + root.data);
        System.out.println("Left Child of Root Node: " + root.left.data);
        System.out.println("Right Child of Root Node: " + root.right.data);
        System.out.println("Left Child of Left Node: " + root.left.right.data);
        System.out.println("Left Child of Left Node: " + root.left.right.data);
        System.out.println("Left Child of Right Node:" + root.right.data);
    }
}

// The binary tree structure is as follows:
//         1
//        / \
//       5   15
//      / \   /
//     20 25 30

// Note: In this example, we have created a simple binary tree with a few nodes.

//! Imp Note: Defined a Node class in multiple java files with the same project, leading to a duplicate class definition error. This occurs because Java doesn't allow multiple classes with the same name in the same package.