import java.util.Enumeration;
import java.util.Vector;


public class VectorExample {

	public static void main(String args[]){
		Vector<String> vec = new Vector<String>();
		vec.add("Hello,");
		vec.addElement("How");
		vec.addElement("are");
		vec.addElement("you");
		vec.addElement("Doing?");
		
		Enumeration<String> e = vec.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}
}
