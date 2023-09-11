public class Main{
	public static void main(String[] args){
		DoublyLinkedList dll = new DoublyLinkedList(7);
		
		dll.append(6);
		dll.append(8);
		dll.append(9);
		dll.append(10);
		dll.append(11);
		
		dll.getHead();
		dll.getTail();
		dll.getLength();
		
		dll.printList();
		
		System.out.println("_____________________________");
		
		//System.out.println(dll.removeLast().value);
		
		//dll.prepend(9);
		//dll.prepend(10);
		
		//System.out.println(dll.removeFirst().value);
		//System.out.println(dll.removeFirst().value);
		
		//System.out.println(dll.get(2).value);
		//System.out.println(dll.set(3, 10));
		
		//system.out.println(dll.insert(1,10));
		
		System.out.println(dll.remove(1).value);
		
		System.out.println("_____________________________");
		dll.getHead();
		dll.getTail();
		dll.getLength();
		
		dll.printList();
	}
}