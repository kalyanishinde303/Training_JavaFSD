package Phase1.assestedPracticeProject;


class DoublyLinkedList{

	 
	   public static void main(String args[]) {
		   DoublyLinkedList1 list = new DoublyLinkedList1();
	       list.add(2);
		   list.add(4);
		   list.add(7);
		   list.add(10);
		   list.display();
		   
	   }

}

class Node{
	 Node previousAddress;
	 int data;
	 Node nextAddress;
	
	
}

class DoublyLinkedList1 {
	private Node head = null;
	private Node tail = null;
	private int size = 0;
	
	public void add(int value) {
		Node node = new Node();
		node.data = value;
		node.previousAddress = null;
		node.nextAddress = null;
		
		if(head == null) {
			head = node;
			tail = node;
		}else{
			tail.nextAddress = node;
			node.previousAddress = tail;
			tail = node;
			
		}
		
	}


public void display() {
	 Node temp = head;
	 while (temp != null) {
		 System.out.println("Current node Add: "+temp);
		 System.out.println("P Add: "+temp.previousAddress);
		 System.out.println("Data: "+temp.data);
		 System.out.println("N Add: "+temp.nextAddress);
		 System.out.println("---------------------------------------------------------------------------");
		 temp = temp.nextAddress;
	 }
}
}