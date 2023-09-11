public class Main{
	public static void main(String[] args){
		DoublyLinkedList dll = new DoublyLinkedList(7);
		
		
		dll.append(6);
		System.out.println("_____________________________");
		dll.getHead();
		dll.getTail();
		dll.getLength();
		
		dll.printList();
	}
}