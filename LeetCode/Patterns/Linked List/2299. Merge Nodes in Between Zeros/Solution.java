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
        ListNode p1 = head;
        ListNode p2 = head.next;
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        while(p2!=null){
            if(p2.val!=0){
                sum+=p2.val;
            }
            else{
                p1 = p1.next;
                p1.val = sum;
                sum= 0;
            }
            p2 = p2.next;
        }
        p1.next = null;
        return head.next;
    }
}