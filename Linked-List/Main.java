public class Main{
	public static void main(String[] args){
		LinkedList linkedList = new LinkedList(1);
		
		linkedList.append(2);
		linkedList.append(3);
		linkedList.append(4);
		linkedList.printList();
		System.out.println("___________________________________");
//		System.out.println(linkedList.removeLast().value);    //remove node 4
		
//		System.out.println(linkedList.removeLast().value);    //remove node 3
		
//		System.out.println(linkedList.removeLast().value);    //remove node 2
		
//		System.out.println(linkedList.removeLast().value);   //remove node 1
		
//		System.out.println(linkedList.removeLast());           //return null

//		linkedList.prepend(5);

//		System.out.println(linkedList.removeFirst().value);    //remove head node i.e.,  First Node
//		System.out.println(linkedList.removeFirst().value);

//		System.out.println(linkedList.set(2,5));

//		System.out.println(linkedList.insert(4,5));

		System.out.println(linkedList.insert(2, 45));
			
//		System.out.println(linkedList.get(2).value);
		System.out.println("_______________________________");
		
		linkedList.getLength();
		
		linkedList.printList();
	}
}