package com.StriverA2Zsheet.Linkedlist;

import java.util.List;

public class DeletionOftheHead {
    class ListNode {
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }


    public ListNode deleteHead(ListNode head){

        if(head == null){
            return null;
        }
        head = head.next;

        return head;
    }

    public static void main(String[] args) {
        DeletionOftheHead obj = new DeletionOftheHead();

        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.next.next.next = obj.new ListNode(4);
        head.next.next.next.next = obj.new ListNode(5);

        ListNode result = obj.deleteHead(head);

        //Print the LL
        ListNode temp = result;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }



    }
}
