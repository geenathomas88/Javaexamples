package excercises;

public class Paliandrome {
	public static void main(String args[]){
		String s ="Malayalam";
		System.out.println(paliandrome(s));
		System.out.println(mypaliandrome(s));
	}
	public static boolean paliandrome(String str){
		StringBuilder strbuilder = new StringBuilder();
		if(str == null)
			return false;
		else{
			return strbuilder.equals(strbuilder.reverse());				
		}
	}
	public static boolean mypaliandrome(String str){
		if (str == null)
			return false;
		else{
			int length = str.length();
			str =str.toLowerCase();
			for(int i = 0; i < length/2; i++){
				if(str.charAt(i) != str.charAt(length-i-1))
					return false;					
			}
			return true;
		}
	}
}
