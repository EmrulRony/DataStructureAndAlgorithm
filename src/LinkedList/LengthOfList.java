package LinkedList;

public class LengthOfList {
public static int length() {
	int count=1;
	Node headNode = LinkedList.head;
	if (headNode==null) {
		return 0;
	}
	while (headNode.next!=null) {
		count++;
		headNode=headNode.next;
	}
	return count;
}
}
