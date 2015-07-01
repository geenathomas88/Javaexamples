//Reverse a string without string methods
package excercises;

public class StringReverse {
	public static void main(String args[]){
		String s = "My name is Geena";
		reverseString(s);
	}
	public static void reverseString(String s){
		char[] temp=s.toCharArray();
		for(int i = temp.length-1; i >=0 ;i--){
			System.out.print(temp[i]);
		}
	}
}
