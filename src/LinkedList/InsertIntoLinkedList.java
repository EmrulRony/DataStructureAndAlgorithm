package LinkedList;

public class InsertIntoLinkedList {
	static void insertAtTheStart(Object object) {
		Node newNode = new Node(object);
		newNode.next = LinkedList.head;
		LinkedList.head = newNode;
	}
	
	static void insertAfterGivenNode(Node prev_node, Object object) {
		if (prev_node == null) {
			System.out.println("Previous node can't be null");
			return;
		}
		Node newNode = new Node(object);
		newNode.next=prev_node.next;
		prev_node.next=newNode;
	}
	
	static void insertAtTheEnd(Object obj) {
		Node newNode = new Node (obj);
		Node pointer = LinkedList.head;
		
		if (pointer==null) {
			LinkedList.head=newNode;
			return;
		}
		
		else {
			while (pointer.next!=null) {
				pointer=pointer.next;
			}
		}
		pointer.next=newNode;
	}
}