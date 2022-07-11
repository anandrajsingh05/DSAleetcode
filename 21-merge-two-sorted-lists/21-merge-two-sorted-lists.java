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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode node1= new ListNode(0);
        ListNode temp= node1;
        
        while(list1!=null || list2 !=null){
            if(list1==null){
                temp.next=list2;
                break;
            }
            else if(list2==null){
                    temp.next=list1;
                    break;
            }
            else if(list1.val<list2.val){
               ListNode cur=list1;
               list1=list1.next;
               temp.next=cur;
               temp=temp.next;
            }
            else{
                ListNode cur=list2;
                list2=list2.next;
                temp.next=cur;
                temp=temp.next;
            }
        }
        
        return node1.next;
    }
}