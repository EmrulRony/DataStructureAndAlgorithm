package LinkedList;

public class LinkedListSample {
	Node head;
	
	static class Node {
		Object data;
		Node next;
		
		Node (Object data){
			this.data=data;
		}
	}
	
	void printLinkedList() {
		Node tmpHead= head;
		while (tmpHead!=null) {
			System.out.print(tmpHead.data);
			System.out.print(" ");
			tmpHead=tmpHead.next;
		}
	}
	
	// Inserting at the start of the linked list
	void pushAtStart(Object data) {
		Node newNode = new Node(data);
			 newNode.next=head;
			 head=newNode;
		
	}
	
	public static void main(String[] args) {
		LinkedListSample linkedList = new LinkedListSample();
		
		Node fNode = new Node(1);
		Node sNode = new Node("A");
		Node tNode = new Node(9.0);
		
		linkedList.head=fNode;
		fNode.next=sNode;
		sNode.next=tNode;
		
		
		
		
		System.out.println("Printing before insertion");
		linkedList.printLinkedList();
		
		linkedList.pushAtStart("B");
		
		System.out.println("\nPrinting after insertion");
		
		linkedList.printLinkedList();
		
	}
}
