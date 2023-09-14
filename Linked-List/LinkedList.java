public class LinkedList{
	private Node head;
	private Node tail;
	private int length;
	
	class Node{
		int value;
		Node next;
		
		public Node(int value){
			this.value = value;
		}
		
		
	}
	
	public LinkedList(int value){
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public void append(int value){
		Node newNode = new Node(value);
		
		if(length == 0) {
			head = newNode;
			tail = newNode;
		} else{
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}
	
	public Node removeLast(){
		if(length == 0)
			return null;
		
		Node temp = head;
		Node pre = head;
		while(temp.next != null){
			pre = temp;
			temp = temp.next;
		}
		tail = pre;
		tail.next = null;
		length--;
		if(length == 0){
			head = null;
			tail = null;
		}
		return temp;
	}
	
	public void prepend(int value){
		Node newNode = new Node(value);
		if(length == 0){
			head = newNode;
			tail = newNode;
		} else{
			newNode.next = head;
			head = newNode;
		}
		length++;
	}
	
	public Node removeFirst(){
		if(length == 0)
			return null;
		
		Node temp = head;
		head = head.next;
		temp.next = null;
		length--;
		
		if(length == 0)
			tail = null;
		
		return temp;
	}
	
	public Node get(int index){
		if(index < 0 || index >= length){
			return null;
		}
		
		Node temp = head;
		for(int i = 0; i < index; i++){
			temp = temp.next;
		}
		return temp;
	}
	
	public boolean set(int index, int value){
		Node temp = get(index);
		if(temp != null){
			temp.value = value;
			return true;
		}
		return false;
	}
	
	public boolean insert(int index, int value){
		if(index < 0 || index > length)
			return false;
		
		if(index == 0){
			prepend(value);
			return true;
		}
		
		if(index == length){
			append(value);
			return true;
		}
		
		Node newNode = new Node(value);
		Node temp = get(index - 1);
		newNode.next = temp.next;
		temp.next = newNode;
		length++;
		return true;
	}
	
	public Node remove(int index){
		if(index < 0 || index >= length)
			return null;
		
		if(index == 0)
			return removeFirst();
		
		if(index == (length-1))
			return removeLast();
		
		Node prev = get(index -1);
		Node temp = prev.next;
		prev.next = temp.next;
		temp.next = null;
		return temp;
	}
	
	public void reverse(){
		Node temp = head;
		head = tail;
		tail = temp;
		
		Node after = temp.next;
		Node before = null;

		for(int i = 0; i < length; i++){
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
	}
	
	//findMiddleNode():- find middle element in the list using fast and slow technique(Floyd's tortoise and hare algorithm)
    //in which second pointer move twice from pointer first;
    //the first pointer is slow pointer and the second pointer is fast pointer
	public Node findMiddleNode(){
		Node fast_ptr = head;
		Node slow_ptr = head;
		
		while(fast_ptr != null && fast_ptr.next != null){
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		}
		return slow_ptr;
	}
	
	public boolean hasLoop(){
		Node fast_ptr = head;
		Node slow_ptr = head;
		
		while(fast_ptr != null && fast_ptr.next != null){
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
			
			if(fast_ptr == slow_ptr){
				return true;
			}
		}
		return false;
	}
	
	public void createLoop(){
		Node temp = head;
		
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = head;
	}
	
	public Node findkthFromEnd(int k){
		Node slow = head;
		Node fast = head;
		
		for(int i = 0; i < k; i++){
			if(fast == null){
				return null;
			}
			fast = fast.next;
		}
		
		while(fast != null){
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow;
	}
	
	public void partitonList(int x){
		if(head == null)
			return;
		
		Node dummy1 = new Node(0);
		Node dummy2 = new Node(0);
		Node prev1 = dummy1;
		Node prev2 = dummy2;
		
		Node current = head;
		
		while(current != null){
			if(current.value <= x){
				prev1.next = current;
				prev1 = current;
			} else{
				prev2.next = current;
				prev2 = current;
			}
			current = current.next;
		}
		
		prev2.next = null;
		prev1.next = dummy2.next;
		head = dummy1.next;
		
	}
	
	public void printList(){
		Node temp = head;
		while(temp != null){
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void getHead(){
		if(head == null){
			System.out.println("Head: " + null);
		} else{
			System.out.println("Head: " + head.value);
		}
	}
	
	public void getTail(){
		if(tail == null){
			System.out.println("Tail: " + null);
		} else{
			System.out.println("Tail: " + tail.value);
		}
	}
	
	public void getLength(){
		System.out.println("Length: " + length);
	}

}