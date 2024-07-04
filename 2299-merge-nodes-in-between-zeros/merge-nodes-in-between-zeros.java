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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head;
        ListNode temp1=head.next;
        int sum=0;
        while(temp1!=null){
               if(temp1.val==0){
                temp.val=sum;
                temp.next=temp1;
                if(temp1.next==null){
                    temp.next=null;
                }
                 temp=temp1;
                temp1=temp1.next;
                sum=0;
               }else{
                    sum+=temp1.val;
                    temp1=temp1.next;
                }
            }
           if(temp.val==0){
            temp=null;
           }
           return head;
        
    }
}