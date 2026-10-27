
package com.StriverA2Zsheet.Linkedlist;

public class DeletionOftheTailLL {

    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode deleteTail(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }

    // Create a linked list from an array
    public ListNode createList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }

        return head;
    }

    // Print the linked list
    public void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println(" -> null");
    }

    public static void main(String[] args) {
        DeletionOftheTailLL obj = new DeletionOftheTailLL();

        int[] arr = {1, 2, 3, 4, 5};

        ListNode head = obj.createList(arr);

        System.out.print("Original List: ");
        obj.printList(head);

        head = obj.deleteTail(head);

        System.out.print("After Deletion: ");
        obj.printList(head);
    }
}
