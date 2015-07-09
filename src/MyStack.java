
public class MyStack {

	private int maxSize;
	private int top;
	private long[] stackArray;
	
	MyStack(int s){
		maxSize = s;
		top =-1;
		stackArray = new long[maxSize];
		}
	
	public void push(long j){
		stackArray[++top] = j;
	}
	
	public long pop(){
		return stackArray[top--];
	}
	
	public long peek(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return (top==-1); 
	}
	
	public static void main(String args[]){
		MyStack stack = new MyStack(10);
		stack.push(21);
		stack.push(34);
		
		while(!stack.isEmpty()){
			System.out.println("Peek---"+stack.peek());
			System.out.println("Pop---"+stack.pop());
			
		}
	}
}

