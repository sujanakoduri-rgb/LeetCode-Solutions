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
    public ListNode swapNodes(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
         ListNode originalHead = head;
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        int n = list.size();
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i]=list.get(i);
        }  
        int temp = res[k-1];
        res[k-1]=res[n-k];
        res[n-k]=temp;
        head = originalHead;
        for(int i=0;i<n;i++){
            head.val = res[i];
            head= head.next;
        }
        return originalHead;
          }
}