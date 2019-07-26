package LinkedList;

public class GetValueByIndex {
	public static Object getValue(int index) {
		int count =0;
		Node headNode = LinkedList.head;
		if (headNode==null) {
			System.out.println("The list is empty");
			return null;
		}
		while (headNode!=null){
			if (count==index) {
				count++;
				headNode=headNode.next;
				return headNode.data;
			}
		}

		return null;
	}
}
