/**Program to learn string operations.
How to replace a substring inside a string by another one ?
Compare strings
How to remove a particular character from a string
How to search a word inside a string ? 
*/
package excercises;

public class StringMethods {
	
	public static void main(String args[]){
								
		replace();
		compare();
		search();
		reverse();
		splitmethod();
		concatandsubstring();
	}
	public static void replace(){
		String s = "Java Programming",t;
		t = s.replace("Java", "Ruby");
		System.out.println(t);		
		System.out.println(s);
		
		String strg = "Hello World";//replace 
		System.out.println(strg.replace('o', 'T'));
		System.out.println("Number of characters in "+ s + " :" + s.length());
	}
	
	public static void concatandsubstring(){
		String v = "I love programming.";
		String u = v.concat("its is fun!!");
		System.out.println(u);
		String str = "Hello Programming";
		
		System.out.println(str.substring(0, 4));//substring
		System.out.println(str.toUpperCase());
	}
		
	public static void compare(){
		String str1,str2;//compare
		str1 = "Hi Geena";
		str2 = "hi geena";
		if(str1 == str2){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
		
	}
	public static void search(){
		String strs = "Hello Worlds";//How to search a word inside a string ?
		int a= strs.indexOf("Wor");
		if(a == -1){
			System.out.println("Not Found!!");
		}else{
			System.out.println("string is found "+ a + " position");
		}
	}
	
	public static void reverse(){
		String mystr = "My world";
		char[] temp = mystr.toCharArray();
		System.out.println("-----------");
		for (int i = (mystr.length()-1); i>=0;i--){
			System.out.print(temp[i]);
		}
		System.out.println();
		//System.out.println(new StringBuilder(mystr).reverse().toString());	//reverse a string
	}
	
	public static void splitmethod(){
		String str = "Jan-feb-mar";
		String[] temp = str.split("-");
		for(int i =0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
		String str1 = "Geena Thomas";
		String[] temp1 = str1.split(" ");
		for(int j =0;j<temp1.length;j++){
			System.out.println(temp1[j]);
		}
	}
	
}
