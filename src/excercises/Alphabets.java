package excercises;
//print alphabets with all loopsS
public class Alphabets {
	public static void main(String args[]){
		char ch;
		for(ch = 'a'; ch<='z'; ch++){
			System.out.print(ch+",");
		}
		System.out.println();
		char c = 'a';
		while(c<='z'){
			System.out.print(c+",");
			c++;
		}
		System.out.println();
		char chr = 'a';
		do{
			System.out.print(chr+",");
			chr++;
		}while(chr<='z');
	}
}
