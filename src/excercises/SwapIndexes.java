//swap even indexes to odd indexes

package excercises;

public class SwapIndexes {
	public static void main(String args[]){
		String str = "This is Geena";
		char[] s=str.toCharArray();
		char temp;
		for(int i=0; i<s.length; i++){
			if (i%2 == 0){	
				if(i+1 == str.length()){
					s[0]=s[i];
					System.out.print(s[0]);
				}else{
					temp = s[i];
					s[i]=s[i+1];
					s[i+1]=temp;
					System.out.print(s[i]);
					System.out.print(s[i+1]);
				}
			}
		}
	}
}
