package excercises;

import java.util.HashSet;
import java.util.Set;

public class StringPermutations {

	public static void main(String[] args){
		String a = "abcde";
		System.out.println(charFinder(a));
	}
	public static Set<String> charFinder(String str){
		Set<String> permSet = new HashSet<String>();
		
		if(str == null)
			return null;
		else if(str.length() == 0)
		{
			permSet.add("");
			return permSet;
			}
		char initial = str.charAt(0);
		String rem = str.substring(1);
		Set<String> words = charFinder(rem);
		for(String strNew : words){
			for(int i =0; i<=strNew.length(); i++){
				permSet.add(charInsert(strNew, initial, i));
			}
		}
		return permSet;
	}
	public static String charInsert(String a, char b, int c){
		String begin = a.substring(0,c);
		String end = a.substring(c);
		
		return begin+b+end;
		
	}
}
