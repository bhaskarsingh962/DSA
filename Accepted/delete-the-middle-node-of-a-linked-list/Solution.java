/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int mid = 0;
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        if(n == 1) return null;
        if(n==2){
            head.next = null;
            return head;
        }
        mid = n/2;
        int i = 1;
        temp = head;
        while(i < mid && temp != null){
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;
        return head;
    }
}