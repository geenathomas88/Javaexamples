import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class LinkedListExample {

	public static void main(String args[]){
		
		List<String> ll = new LinkedList<String>();
		ll.add("dog");//insert
		ll.add("cat");
		ll.add("cow");
		ll.add("fish");
		ll.add("parrot");
		ll.add("hen");
		ll.add("monkey");
		
		System.out.println("Linked list : "+ll);//print list
		
		ll.remove(0);//remove at index
		ll.remove("cat");//remove at value
		System.out.println("Linked list : "+ll);
		
		System.out.println("Before setting: "+ll.get(1));
		ll.set(1, "man");//set a value
		System.out.println("After setting: "+ll.get(1));
		
		Collections.sort(ll);
		System.out.println("Linked list : "+ll);//
	}
}
