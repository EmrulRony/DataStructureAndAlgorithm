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
		Node tmpHead = new Node();
		tmpHead = LinkedList.head;
		while (tmpHead != null) {
			System.out.print(tmpHead.data);
			System.out.print(" ");
			tmpHead = tmpHead.next;
		}
	}
}

// Class for inserting into the linked list
class InsertIntoLinkedList {
	static void insertAtTheStart(Object object) {
		Node newNode = new Node(object);
		newNode.next = LinkedList.head;
		LinkedList.head = newNode;
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
	}
}
