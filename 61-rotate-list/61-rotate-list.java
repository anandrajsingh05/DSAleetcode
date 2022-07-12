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
    public ListNode rotateRight(ListNode head, int k) {
      if(head==null)return null;
        else if(k==0)return head;
        
        int size= length(head);
        k=k%size;
        
        if(k==0)return head;
       
        
        
        
        int pos=size-k;
        ListNode cur=head;
        ListNode pre=null;
        int i=0;
        while(i<pos){
            pre=cur;
            cur=cur.next;
            i++;
        }
        
        pre.next=null;
        
        ListNode newHead=cur;
        while(cur.next!=null){
            cur=cur.next;
        }
        
        cur.next=head;
        head=newHead;
        
        
       return head; 
        
    }
    public int length(ListNode head){
        ListNode cur=head;
        int size=0;
        while(cur!=null){
            size++;
            cur=cur.next;
        }
        return size;
    }
    
}