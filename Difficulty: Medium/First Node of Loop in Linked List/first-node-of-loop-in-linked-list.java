/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        // code here
        
        
        boolean ans = false;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                ans = true ;
                break;
            }
        }
        if(ans == false){
            return -1;
        }
        
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return fast.data;
        
        
        
    }
}