package LinkedList;

class DeleteFromList{
	
	static void deleteByValue(Object object) {
		Node head = LinkedList.head;
		Node pointer = head.next;
		
		if (LinkedList.head==null) {
			System.out.println("The list is empty. Nothing to delete");
			return;
		}
		
		else if (head.next!=null & head.data==object) {
			
			head=head.next;
			return;
		}
		
		while (pointer!=null) {
			if (pointer.data==object) {
				head.next=pointer.next;
				return;
			}
			head=pointer;
			pointer=pointer.next;
		}
	}
	
	static void deleteByIndexNo(int index) {
		Node head = LinkedList.head;
		Node pointer = head.next;
		
		if (head.next!=null & index==0) {
			LinkedList.head=pointer;
			return;
		}
		
		int counter=1;
		
		while(pointer!=null) {
			if (counter==index) {
				head.next=pointer.next;
				System.out.println("--"+LinkedList.head.data);
				return;
			}
			head=pointer;
			pointer=pointer.next;
			
			counter++;
		}
		
		System.out.println("Index not found");
		
	}
	
}