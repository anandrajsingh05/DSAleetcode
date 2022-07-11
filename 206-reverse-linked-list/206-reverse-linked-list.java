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
    public ListNode reverseList(ListNode head) {
        
        ListNode cur=head;
        ListNode pre=null;
        ListNode aft=null;
        while(cur!=null){
            aft=cur.next;
            cur.next=pre;
            pre=cur;
            cur=aft;
        }
        head=pre;
        
        return head;
        
    }
}