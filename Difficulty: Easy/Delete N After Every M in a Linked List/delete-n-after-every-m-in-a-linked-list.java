/* Structure of Linked List Node
class Node
{
  int data;
  Node next;
  Node(int data)
  {
      this.data = data;
      this.next = null;
  }
}*/

class Solution {
    static void linkDelete(Node head, int n, int m) {
        // code here
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            
            // Skip the node
            for(int i=0; i<m && temp!=null; i++){
                prev = temp;
                temp = temp.next;
            }
            
            
            for(int i=0; i<n && temp!=null; i++){
                temp = temp.next;
            }
            prev.next = temp ;
        }
    }
}