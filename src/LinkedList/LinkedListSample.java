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
		while (head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListSample linkedList = new LinkedListSample();
		
		Node fNode = new Node(1);
		Node sNode = new Node("A");
		Node tNode = new Node(9.0);
		
		linkedList.head=fNode;
		fNode.next=sNode;
		sNode.next=tNode;
		
		linkedList.printLinkedList();
	}
}
