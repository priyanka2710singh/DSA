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
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
       
        // reverse the list start from the slow
        
        
        ListNode revHead = reverse(slow);
        
        while(revHead!=null)
        {
            if(revHead.val != head.val)
                return false;
            else
            {
                revHead = revHead.next;
                head = head.next;
            }
        }
        return true;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null)
            return true;
        
        List<Integer> list = new ArrayList<>();
        
        while(head!=null)
        {
            list.add(head.val);
            head = head.next;
        }
        int start = 0;
        int end = list.size()-1;
        while(start<end)
        {
            if(list.get(start) != list.get(end))
                return false;
            
            start++;
            end--;
        }
        return true;
    }
}
// tc - O(n)  sc O(n) */