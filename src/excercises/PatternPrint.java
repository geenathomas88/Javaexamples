package excercises;

public class PatternPrint {
	public static void main(String args[]){
		for(int i =1;i<=5;i++){			
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k = 5;k>0;k--){	
			for(int l = k;l>0;l--){
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
