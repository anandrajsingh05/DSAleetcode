/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode cur=head;
        Set<ListNode> set= new HashSet<>();
        
        while(cur!=null){
            if(!set.contains(cur)){
                set.add(cur);
                cur=cur.next;
            }
            else{
                break;
            }
        }
        return cur;
    }
}