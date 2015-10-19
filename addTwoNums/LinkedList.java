public class LinkedList{
	Node head;

	public LinkedList(){
		this.head = new Node();

	}

	class Node{
		int data = 0;
		Node next =  null;

		public Node(){
	
		}


	}


	void addToTail(Node t){
		Node curr = head;
		while(curr != null || curr.next != null){
			curr = curr.next;
		}
		curr.next = t;

	}



}