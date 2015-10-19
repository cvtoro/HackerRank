//add two numbers stored as linked lists
//example: 2->1>6 + 7-> 5->4  = 612 + 457
//result: 9->6->0->1

public static addTwoNumbers(LinkedList one, LinkedList two){
	Node digit1 = one.head;
	Node digit2 =  two.head;

	int carry = 0;
	LinkedList sum = new LinkedList();

	while (digit1!= null && digit2 != null){
		int digitSum = digit1.data + digit2.data + carry;
		if (digitSum > 10){
			carry = 1;
			digitSum = digitSum % 10;
		}
		else{
			carry = 0
		}

		sum.addToTail(new Node(digitSum));

		digit1 = digit1.next;
		digit2 = digit2.next;


	}

}