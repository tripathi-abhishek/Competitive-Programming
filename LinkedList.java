package LinkedLists;

public class LinkedList {
	//node class
	static class Node{
		int data;
		Node next;
		
		//constructor
		public Node (int data)
		{
			this.data = data;
			//next = null;
		}
	}
	
	Node head;
	
	
	//function to add LinkedLists//
	void add(int data)
	{
		Node toAdd = new Node(data); //toAdd is the object of Node class
		
		if(head == null)
		{
			head = toAdd;
			return;
		}
		
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		temp.next = toAdd;
	}
	
	void print()
	{
		Node temp = head;
		while(temp != null)   //taking temp != null so that last element can be printed.
		{
			System.out.print(temp.data+ " " );
			temp = temp.next;
		}
	}
	
	void removeFront()   // this is written by me😎
	{
		Node toRemove = head;
		head = toRemove.next;
	}
	
	void removeLast() 
	{
		Node temp = head;     // temp points towards the head
		while(temp.next.next != null)   // while next to the next of the node called 'temp' is not  null
		{
			temp = temp.next;  // keep on traversing and temp changes it's position to the next node everytime
		}
		temp.next = null;  // when loop ends and "temp.next.next == null" then make the pointer of the current temp equal to null.
							//this means that the node next to temp will become null. 
	}
	
	
	
	
	public static void main(String[] args) {
		
		int count = 0;
		LinkedList ll = new LinkedList();
		
  
		for(int i=0;i<10;i++) 
		{
			ll.add(i);
			count++;
		}
		
		System.out.print("Linkedlist: ");
		ll.print();
		System.out.println("\n"+"Number of Nodes: "+count);
		ll.removeFront();
		
		System.out.print("\n");
		System.out.print("Front delete: ");
		ll.print();
		
		ll.removeLast();
		System.out.print("\n"+"\n"+"Last delete: "); 
		ll.print();
		
		
		
	}

}
