public class Main{
	public static void main(String[] args){
		Queue queue = new Queue(1);
		
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		
		queue.printQueue();
		queue.getFirst();
		queue.getLast();
		queue.getLength();
		System.out.println("____________________________");
		
		System.out.println(queue.dequeue().value);
		
		System.out.println("____________________________");
		
		queue.printQueue();
		queue.getFirst();
		queue.getLast();
		queue.getLength();
		
	}
}