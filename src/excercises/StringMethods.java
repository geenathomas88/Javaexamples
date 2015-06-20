/**Program to learn string operations.
How to replace a substring inside a string by another one ?
Compare strings
How to remove a particular character from a string
How to search a word inside a string ? 
*/
package excercises;

public class StringMethods {
	public static void main(String args[]){
		String s = "Java Programming",t,u;
		
		System.out.println("Number of characters in "+ s + " :" + s.length());
		
		t = s.replace("Java", "Ruby");
		System.out.println(t);		
		System.out.println(s);
		
		u = t.concat("is fun!!");
		System.out.println(u);
		
		
		String str = "Hello World";//replace 
		System.out.println(str.replace('o', 'T'));
		
		String str1,str2;//compare
		str1 = "Hi Geena";
		str2 = "hi geena";
		if(str1 == str2){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
		
		System.out.println(str1.substring(0, 4));//substring
		
		System.out.println(new StringBuilder(str2).reverse().toString());	//reverse a string	
		
		String strs = "Hello Worlds";//How to search a word inside a string ?
		int a= strs.indexOf("Map");
		if(a == -1){
			System.out.println("Not Found!!");
		}else{
			System.out.println("string is found"+ a + " position");
		}
		
	}
}
