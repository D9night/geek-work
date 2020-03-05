package com.geek.work;

/**
 * 合并两个有序数组
 *
 * @author Liuxs
 * @version V1.0.0
 * @date 2020-03-05 12:31 PM
 */
public class MergeTwoList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result;
        if (l1 == null || l2 == null) {
            result = l1 == null ? l2 : l1;
            return result;
        }
        if ( l1.val<=l2.val) {
            result = new ListNode(l1.val);
            result.next = mergeTwoLists(l1.next, l2);
        } else {
            result = new ListNode(l2.val);
            result.next = mergeTwoLists(l1, l2.next);
        }
        return result;

    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        MergeTwoList test = new MergeTwoList();
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(1);
        b.next = a;
        c.next = b;
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(1);
        e.next = d;
        f.next = e;
        ListNode result = test.mergeTwoLists(c, f);
        while (result.next != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
