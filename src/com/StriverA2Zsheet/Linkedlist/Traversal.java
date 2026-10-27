package com.StriverA2Zsheet.Linkedlist;

import java.util.ArrayList;
import java.util.List;

public class Traversal {

    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public List<Integer> LLTraversal(ListNode head) {
        List<Integer> result = new ArrayList<>();
        ListNode temp = head;

        while(temp != null){
            result.add(temp.data);
            temp = temp.next;
        }

        return result;
    }

    public static void main(String[] args) {
        Traversal obj = new Traversal();

        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.next.next.next = obj.new ListNode(4);
        head.next.next.next.next = obj.new ListNode(5);

        List<Integer> result = obj.LLTraversal(head);

        System.out.println(result);
    }
}
