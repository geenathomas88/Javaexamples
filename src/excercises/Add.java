//program to add two large numbers

package excercises;

import java.util.Scanner;
import java.math.BigInteger;

public class Add {
	public static void main(String args[]){
		String a, b;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		a = s.nextLine();
		b =s.nextLine();
		
		BigInteger num1 = new BigInteger(a);
		BigInteger num2 = new BigInteger(b);
		BigInteger sum;
		
		sum = num1.add(num2);
		//c = a+b;
		System.out.print(sum);
	}
}
