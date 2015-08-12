package excercises;

public class Permutations {

	public static void main(String[] args){
		
		permute("abcd", "");
	}
	public static void permute(String s, String a){
		if (s.length() == 0)
			System.out.println(a);
		else
			for(int i = 0; i < s.length(); i++){
				StringBuilder s2 = new StringBuilder(s);
				char b = s2.charAt(i);
				s2.deleteCharAt(i);
				String s1 = s2.toString();
				permute(s1, a+b);
			}
	}
}
