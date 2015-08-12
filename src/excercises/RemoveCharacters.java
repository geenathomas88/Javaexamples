package excercises;

import java.util.Scanner;

public class RemoveCharacters {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word");
		String string = scanner.next();
		System.out.println(replaceChar(string,'a'));
		scanner.close();
	}
	private static String replaceChar(String s, char c){
		if (s == null)
			return null;
		
		return s.replaceAll(Character.toString(c), "");
		
	}
}
