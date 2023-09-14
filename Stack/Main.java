public class Main{
	public static void main(String[] args){
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.printStack();
		stack.getTop();
		stack.getHeight();
		
		System.out.println("______________________");
		
		System.out.println(stack.pop().value);
		System.out.println(stack.pop().value);
		System.out.println(stack.pop().value);
		System.out.println(stack.pop().value);
		System.out.println(stack.pop().value);
		
		System.out.println("______________________");
		stack.printStack();
		stack.getTop();
		stack.getHeight();
	}
}