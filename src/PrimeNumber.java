
public class PrimeNumber {
	public static void main(String args[]){
		//Prime number
		int num = 8;
		int count = 0;
		for (int i=2;i<=num/2;i++){			
			if(num%i == 0){
				count++;
			}
		}
		if (count==0){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not Prime");
		}
	}
}
