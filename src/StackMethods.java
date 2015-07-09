import java.util.EmptyStackException;
import java.util.Stack;


public class StackMethods {
	public static void main(String args[]){
		
		Stack<Integer> st = new Stack<Integer>();
		System.out.println("Stack: "+st);
		showpush(st,33);
		showpush(st,44);
		showpush(st,55);
		showpush(st,66);
		showpush(st,77);
		showpop(st);
		showpop(st);
		showpop(st);
		showpop(st);
		showpop(st);
		showpop(st);
	}
	static void showpush(Stack<Integer> stack, int a){	
		System.out.print("Push---");
		stack.push(new Integer(a));
		System.out.println(a);
		System.out.println("Stack : "+ stack);		
	}
	static void showpop(Stack<Integer> stack){
		System.out.print("Pop---");
		try {
			Integer a = (Integer) stack.pop();
			System.out.println(a);
			System.out.println("Stack : "+ stack);
		} catch (EmptyStackException e) {
			System.out.println("Stack is empty!!!!!!!!!");
			e.printStackTrace();
		}
	}
}

