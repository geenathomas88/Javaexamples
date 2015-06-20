
public class Overloading {

	//add int and int
	public static void add(int a, int b){
	int c = a+b;
	System.out.println(c);	
	}
	
	//Add int and float
	public static void add(int a, float b){
		float c =a+b;
		System.out.println(c);
	}
	
	//Add double and float
	public static void add(double a, float b){
		double c = a+b;
		System.out.println(c);
	}

	//Add int , double and float
	public static void add(int a,float b, double c){
		double d = a+b+c;
		System.out.println(d);
	}
	
	//Subtract int, int
	public static void subtract(int a, int b){
		int c = a-b;
		System.out.println(c);
	}
	
	//Subtract int, float
	public static void subtract(int a, float b){
		float c = a-b;
		System.out.println(c);
	}
	
	//Subtract float, float
	public static void subtract(float a, float b){
		float c = a-b;
		System.out.println(c);
	}
	
	//multiply int and int
	public static void multiply(int a, int b){
		int c = a*b;
		System.out.println(c);
	}
	
	//multiply float and int
	public static void multiply(float a, int b){
		float c = a*b;
		System.out.println(c);
	}
	
	//multiply int and float
	public static void multiply(int a, float b){
		float c = a*b;
		System.out.println(c);
	}
		
	//multiply float and float
	public static void multiply(float a, float b){
		float c = a*b;
		System.out.println(c);
	}
	
	//multiply float and double
	public static void multiply(float a, double b){
		double c = a*b;
		System.out.println(c);
	}
	
	//multiply double and double
	public static void multiply(double a, double b){
		double c = a*b;
		System.out.println(c);
	}
		
	//multiply int, float and double
	public static void multiply(int a,float b, double c){
		double d = a*b*c;
		System.out.println(d);
	}
	
	//divide int, int
	public static void divide(int a,int b){
		int c = a/b;
		System.out.println(c);
	}
	
	//divide int, float
	public static void divide(int a,float b){
		float c = a/b;
		System.out.println(c);
	}
	
	//divide float, float
	public static void divide(float a,float b){
		float c = a/b;
		System.out.println(c);
	}
	
	//divide double, double
	public static void divide(double a,double b){
		double c = a/b;
		System.out.println(c);
	}

	//divide double, float
	public static void divide(double a,float b){
		double c = a/b;
		System.out.println(c);
	}
	
	public static void main(String args[]){
		add(1,2);
		add(5,2.3f);
		add(3.45,5.6f);
		add(56,3.4f,99.9);
		
		subtract(34,23);
		subtract(32,3.1f);
		subtract(39.2f,1.3f);
		
		multiply(45,67);
		multiply(54.9f,98);
		multiply(34.8f,75.3f);
		multiply(32,34.8f,75.39);
		
		divide(78,9);
		divide(23,2.1f);
		divide(5.5f,1.1f);
		divide(36.67,89.65);
		divide(98.56,4.6f);
	}
}
