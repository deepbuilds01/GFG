/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node addOne(Node head) {
        //  count 
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        Node temp2 = head;
        int trav = 0 ;
        while(count != 0){
            while(trav != count-1){
                temp2 = temp2.next;
                trav++;
            }
            temp2.data = temp2.data+1;
            if(temp2.data == 10){
                temp2.data = 0;
                count--;
                temp2 = head;
                trav = 0;
            }else{
                return head;
            }
        }
        Node newnode = new Node(1);
        newnode.next = head;
        head = newnode;
        return head;
    }
}