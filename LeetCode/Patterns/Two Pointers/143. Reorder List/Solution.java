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
import java.util.*;

class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Stack<ListNode> st = new Stack<>();

        ListNode curr = head;

        while (curr != null) {
            st.push(curr);
            curr = curr.next;
        }

        curr = head;

        int n = st.size();

        for (int i = 0; i < n / 2; i++) {

            ListNode last = st.pop();

            ListNode next = curr.next;

            curr.next = last;
            last.next = next;

            curr = next;
        }

        curr.next = null;
    }
}