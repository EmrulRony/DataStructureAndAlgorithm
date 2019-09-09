package Queue;

class Queue{
	int front,rear,size,capacity;
	int arr[];
	
	Queue(){
		
	}
	
	Queue(int capacity){
		this.capacity=capacity;
		this.rear=-1;
		this.arr=new int[capacity];
	}
	
	boolean isFull() {
		if (size>=capacity) {
			System.out.println("Queue overflowed!!");
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean isEmpty() {
		if (size==0) {
			System.out.println("The queue is empty");
			return true;
		}
		else {
			return false;
		}
			
	}
	
	boolean enqueue(int data) {
		if(isFull()) {
			return false;
		}
		arr[++rear]=data;
		size++;
		System.out.println("Enqueued :"+data);
		return true;
	}
	
	boolean dequeue() {
		if (isEmpty())
			return false;
		int x = arr[front];
		front++;
		size--;
		System.out.println("Dequeued: "+x);
		return true;
	}
	
	int front() {
		if (isEmpty())
			return 0;
		else 
			return arr[front];
	}
	int rear() {
		if (isEmpty())
			return 0;
		else 
			return arr[rear];
	}
	
}

public class iImplQueueByArray {
public static void main(String[] args) {
	
	Queue obj = new Queue(10);
	
	obj.enqueue(10);
	obj.enqueue(20);
	obj.enqueue(30);
	obj.enqueue(40);
	obj.enqueue(50);
	
	
	obj.dequeue();
	System.out.println("Current front: "+obj.front());
	System.out.println("Current rear: "+obj.rear());
	obj.dequeue();
	System.out.println("Current front: "+obj.front());
	System.out.println("Current rear: "+obj.rear());
	obj.dequeue();
	System.out.println("Current front: "+obj.front());
	System.out.println("Current rear: "+obj.rear());
	obj.dequeue();
	System.out.println("Current front: "+obj.front());
	System.out.println("Current rear: "+obj.rear());
	obj.dequeue();
	System.out.println("Current rear: "+obj.front());
	
	
}
}
