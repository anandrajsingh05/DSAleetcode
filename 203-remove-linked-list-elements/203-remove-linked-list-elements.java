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
    public ListNode removeElements(ListNode head, int val) {
        
        if(head ==null) return head;
        while(head!=null && head.val==val){
            head=head.next;
        }
        ListNode cur= head;
        ListNode pre=null;
        
        while(cur!=null){
            if(cur.val != val){
                pre=cur;
                cur=cur.next;
            }
            // System.out.println(123);
            else{
                pre.next=cur.next;
                cur=pre.next;
            }
           
        }
        
        return head;
        
    }
}