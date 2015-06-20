package excercises;

public class FibanocciNumber {
	public static void main(String args[]){
		int num = 5,a =0,c=1, b=1;
		System.out.println(a);
		for(int i= 0;i<=num;i++){
			c = a+b;
			System.out.println(c);
			b = a;
			a = c;
		}
	}
}
