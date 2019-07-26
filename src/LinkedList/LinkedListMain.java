package LinkedList;

// LinkedList class
class LinkedList {
	static Node head;
}

// Node class 
class Node {
	Object data;
	Node next;

	public Node() {

	}

	public Node(Object data) {
		this.data = data;
	}
}

// Class for printing linked list
class LinkedListPrinter {
	static void printMyList() {
		Node tmpHead = LinkedList.head;
		while (tmpHead != null) {
			System.out.print(tmpHead.data+" ");
			tmpHead = tmpHead.next;
		}
		System.out.println(" ");
	}
}

public class LinkedListMain {
	public static void main(String[] args) {

		Node firstNode = new Node(1);
		Node secondNode = new Node("A");
		Node thirdNode = new Node(3.2);
		Node forthNode = new Node("C");

		LinkedList.head = firstNode;
		firstNode.next = secondNode;
		secondNode.next = thirdNode;
		thirdNode.next = forthNode;

		// Printing datas of nodes
		System.out.println("The values of the default Linked List");
		LinkedListPrinter.printMyList();
		
		
		//Inserting a new element into linked list(Begining)
		System.out.println("Inserting new element at the start");
		InsertIntoLinkedList.insertAtTheStart("X");
		LinkedListPrinter.printMyList();
		
		//Inserting a new element after a given node
		System.out.println("Inserting new element after a given node");
		InsertIntoLinkedList.insertAfterGivenNode(forthNode, 100);
		LinkedListPrinter.printMyList();
		
		//Inserting a new node at the end of the linked list
		System.out.println("Inserting a new node at the end of the linked list");
		InsertIntoLinkedList.insertAtTheEnd("###");
		LinkedListPrinter.printMyList();
		
		// Deleting nodes from LinkedList by given value
		System.out.println("Deleting a node by given value");
		DeleteFromList.deleteByValue("X");
		LinkedListPrinter.printMyList();
		
		// Deleting node from LinkedList by given 
		System.out.println("Deleting a node by given index number");
		DeleteFromList.deleteByIndexNo(0);
		LinkedListPrinter.printMyList();
		
		// Printing the length of a linked list
		System.out.println("The length of the linked list is.."+LengthOfList.length());
		
		// Getting the value of a node by given index
		System.out.println("The value for index 2 is : "+GetValueByIndex.getValue(2));
		
	}
}
