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
    public int pairSum(ListNode head) {
        int maxi = 0;
        ArrayList<Integer>li = new ArrayList<>();
        while(head != null){
          li.add(head.val);
          head = head.next;
        }
        int n = li.size()-1;
        int i = 0;
        while(i<n){
            int sum = li.get(i) + li.get(n);
            if(sum > maxi) maxi = sum;
            i++;
            n--;
         }
         return maxi;
    }
}