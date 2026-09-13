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
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
          ListNode prv=null;
          while(slow!=null){
          ListNode next=slow.next;
          slow.next=prv;
          prv=slow;
          slow=next;
          }
            while(prv != null) {
            if(head.val != prv.val) {
                return false;
            }
            head = head.next;
            prv = prv.next;
        }

        return true;
        
    }
}