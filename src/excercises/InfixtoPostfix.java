package excercises;



//import java.util.Stack;

public class InfixtoPostfix {

	private MyStack stack;
	private String input;
	
	public InfixtoPostfix(String s) {
		input =s;
		int stackSize = input.length();
		MyStack stack = new MyStack(stackSize);		
	}
	
	public void intopo(){
		for(int i =0; i<input.length(); i++){
			char ch = input.charAt(i);
		}
	}
	public static void main(String args[]){
		
	}
}
