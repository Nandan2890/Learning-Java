public class DoublyLinkedList{
	private Node head;
	private Node tail;
	private int length;
	
	class Node{
		int value;
		Node next;
		Node prev;
		Node(int value){
			this.value = value;
		}
	}
	
	public DoublyLinkedList(int value){
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public DoublyLinkedList(){
		
	}
	
	public void append(int value){
		Node newNode = new Node(value);
		if(length == 0){
			head = newNode;
			tail = newNode;
		}else{
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		length++;
	}
	
//	public Node removeLast(){
//		if(length == 0){
//			return null;
//		}
//		Node temp = head;
//		Node pre = head;
//		while(temp.next != null){
//			pre = temp;
//			temp = temp.next;
//		}
//		temp.prev = null;
//		tail = pre;
//		tail.next = null;
//		length--;
//		
//		return temp;
//	}
	
	public Node removeLast(){
		if(length == 0){
			return null;
		}
		
		Node temp = tail;
		
		if(length == 1){
			head = null;
			tail = null;
		} 
		else{
			tail = tail.prev;
			tail.next = null;
			temp.prev = null;
		}
		length--;
		
		return temp;
	}
	
	public void prepend(int value){
		Node newNode = new Node(value);
		if(length == 0){
			head = newNode;
			tail = newNode;
		} else{
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
		length++;
	}
	
	public Node removeFirst(){
		if(length == 0){
			return null;
		}
		
		Node temp = head;
		
		if(length == 1){
			head = null;
			tail = null;
		} else{
			head = head.next;
			head.prev = null;
			temp.next = null;
		}
		length--;
		
		return temp;
	}
	
	public Node get(int index){
		if(index < 0 || index >= length){
			return null;
		}
		
		Node temp = head;
		
		if(index < length/2){
			for(int i = 0; i < index; i++){
				temp = temp.next;
			}
		}else{
			temp = tail;
			for(int i = length-1; i > index; i--){
				temp = temp.prev;
			}
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
		if(index < 0 || index > length){
			return false;
		}
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
		temp.next.prev = newNode;
		temp.next = newNode;
		newNode.prev = temp;
		
		length++;
		
		return true;
	}
	
	public Node remove(int index){
		if(index < 0 || index >= length){
			return null;
		}
		
		if(index == 0){
			removeFirst();
		}
		if(index == length-1){
			removeLast();
		}
		//1st method
		//Node before = get(index-1);
		//Node after = before.next;
			
		//before.next = after.next;
		//after.next.prev = after.prev;
		//after.next = null;
		//before.prev = null;
		
		//2nd method
		Node temp = get(index);
		
		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;
		temp.next = null;
		temp.prev = null;
		
		length--;
		
		//return after;
		
		return temp;
	}
	
	public void swapFirstLast(){
		
		Node temp1 = head;
		Node temp2 = tail;
		
		if(length >= 2){
			temp1.prev = temp2.prev;
			temp2.prev.next = temp1;
			
			temp2.next = head.next;
			head.next.prev = temp2;
			
			head = temp2;
			tail = temp1;
			
			head.prev = null;
			tail.next = null;
		}else{
			System.out.println("Length should be greater than or equal to 2");
		}
	}
	
	public void reverse(){
		Node current = head;
		Node temp = null;
		while(current != null){
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}
		
		temp = head;
		head = tail;
		tail = temp;
	}
	
	public boolean isPalindrome(){
		if(length <= 0){
			return true;
		}
		
		Node right = tail;
		Node left = head;
		
		for(int i = 0; i < length/2; i++){
			if(left.value != right.value)
				return false;
			
			left = left.next;
			right = right.prev;
		}
		
		return true;
	}
	
	public void swapPairs(){
		Node dummy = new Node(0);
		dummy.next = head;
		Node previous = dummy;
		
		while(head != null && head.next != null){
			//identify nodes to swao
			Node first = head;
			Node second = head.next;
			
			//update pinters to swap nodes
			previous.next = second;
			first.next = second.next;
			second.next = first;
			
			//update previous pointers
			second.prev = previous;
			first.prev = second;
			
			if(first.next != null){
				first.next.prev = first;
			}
			
			//move pointers for the next iteration and update list head
			head = first.next;
			previous = first;
		}
		head = dummy.next;
		if(head != null){
		    head.prev = null;
		}
	}
	
	public void printList(){
		Node temp = head;
		while(temp != null){
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void getHead(){
		System.out.println("Head: " + head.value);
	}
	
	public void getTail(){
		System.out.println("Tail: " + tail.value);
	}
	
	public void getLength(){
		System.out.println("Length: " + length);
	}
}