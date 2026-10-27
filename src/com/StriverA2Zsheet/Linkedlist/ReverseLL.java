package com.StriverA2Zsheet.Linkedlist;

public class ReverseLL {
    class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public ListNode reverseList(ListNode head){


//        ListNode prev = null;
//        ListNode curr = head;
//
//        while(curr != null){
//            ListNode temp = curr.next;  //Save the node
//            curr.next = prev;           //Reverse the link
//            prev = curr;                //Move prev forward
//            curr = temp;                //Move curr forward
//        }
//
//
//        return prev;

        //Recursive Approach
        if (head == null || head.next == null)
            return head;

        ListNode newHead = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }


    public static void main(String[] args) {
        ReverseLL obj = new ReverseLL();

        ReverseLL.ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.next.next.next = obj.new ListNode(4);

        //Reverse LL
        ReverseLL.ListNode rev = obj.reverseList(head);

       //Print reversed LL
        while(rev!=null){
            System.out.print(rev.data + " -> ");
            rev = rev.next;
        }

        System.out.println("null");
    }
}
