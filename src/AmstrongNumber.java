
public class AmstrongNumber {
	public static void main(String args[]){
		int num = 125;
		int a,b,c,sumofcubes=0;
		a = num;
		while(a!= 0){
			c = a;
			a = a/10;
			b = c%10;
			sumofcubes = sumofcubes+(b*b*b);			
		}		
		if(num == sumofcubes){
			System.out.println(num+" is an Amstrong number");
		}
		else{
			System.out.println(num+" is not an Amstrong number");
		}
	}
}
