
public class CallByValue {
	int lear;
	int year; // Instance variable
	public static void main(String [] args) {
	    CallByValue bd = new CallByValue();
	    bd.lear=200;
	    bd.year=300;
	    int a=56;
	    bd.showYear(a,bd);
	    System.out.println(a);
	    System.out.println(bd.lear);
	}
	public void showYear(int a, CallByValue bd) {
	        a=59;
	        System.out.println(bd.lear);
	        bd.lear=400;
	        System.out.println(bd.lear);
	        System.out.println(a);
	}
}
