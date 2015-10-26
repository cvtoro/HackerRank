public static class Stack{
	Node top;
	Node min;

	public Stack(){

	}

	public void push(Object item){
		if (top ! = null){
			Node newTop = new Node(item);
			newTop.next = top;

			top = newTop;
			if(top.data < min.data){
				min = top;
			}

		}	
		else{
			top = new Node(item);
			min = top;
		}	




	}

	public Object min(){
		return this.min;
	}

	public Object pop(){
		if (top != null){
			if(min != top){
				Node oldTop = top;
				top = top.next;
			}
		}
		


	}



}