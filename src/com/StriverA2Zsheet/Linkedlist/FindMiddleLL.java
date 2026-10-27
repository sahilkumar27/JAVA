package com.StriverA2Zsheet.Linkedlist;

public class FindMiddleLL {
    class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public ListNode findMiddle(ListNode head){

        //base case
        if(head == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }



    public static void main(String[] args) {
        FindMiddleLL obj = new FindMiddleLL();

        FindMiddleLL.ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.next.next.next = obj.new ListNode(4);
        head.next.next.next.next = obj.new ListNode(5);
        head.next.next.next.next.next = obj.new ListNode(6);

        //Find the middle node
        FindMiddleLL.ListNode middle = obj.findMiddle(head);

        //Print the middle element
        if (middle != null){
            System.out.println("Middle element: " + middle.data);
        } else {
            System.out.println("Linked List is empty");
        }

    }
}
