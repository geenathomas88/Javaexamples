import java.util.Scanner;
public class ScannerExample {

  public static void main(String[] args) {
	   while(true){
		   example();
	   }
    
  }
  public static void example(){
	  int n;
	    
	    Scanner input = new Scanner(System.in);
	    while (true) {
	      System.out.println("Input an integer");
	      n = input.nextInt();
	 
	      if (n != 0) {
	    	  System.out.println("You entered " + n);
		      break;
	      }
	      else{
	    	  System.out.println("Bye" );
	    	  System.exit(0);
	      }
	    }
	   }
}