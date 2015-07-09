//reverse a list of numbers using stack

package excercises;

import java.util.Stack;

public class ReverseUsingstack {

	public static void main(String args[]){
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i= 0; i<=5; i++){
			stack.push(new Integer(i));
		}
		System.out.println(stack);
		
		while(!stack.empty()){
			System.out.println(stack.pop());
		}
	}
}

