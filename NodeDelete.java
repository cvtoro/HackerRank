/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    int index = 0;
    Node current = head;
    if (position == 0 ){
        head = head.next;
       
    }
    else{
        while (index < (position - 1)){ 
            current = current.next;
            index ++;
        }
        current.next = current.next.next;
    }
    return head;
}