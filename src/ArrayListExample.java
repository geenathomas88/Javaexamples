import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;


public class ArrayListExample {

	public static void main(String args[]){
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("Item 1");
		arraylist.add("Item 2");
		arraylist.add("Item 3");
		
		arraylist.add(2,"Item 4");//insert at a position
		
		System.out.println("The arrayList : " +arraylist);//print arraylist
		
		int position = arraylist.indexOf("Item 4");
		System.out.println("Position of Item 4 : "+position);//get position
		
		boolean check = arraylist.isEmpty();
		System.out.println("Check empty : "+ check);//checking empty
		
		int size = arraylist.size();
		System.out.println("Size : "+ size);//find size
		
		if(arraylist.contains("Item 5")){
			System.out.println("Present");//checking element present
		}
		else{
			System.out.println("Not Present");
		}
		
		System.out.println("Element in 0th position : "+arraylist.get(0));//element in a position
		
		Iterator<String> i = arraylist.iterator();//iterate array
		System.out.println("Iterating the array: ");
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		arraylist.remove(0);//removal
		System.out.println("The  arrayList after removal : " +arraylist);
		
		arraylist.set(0, "new first item");//replacing
		System.out.println("The  arrayList after replacing : " +arraylist);
		
		String[] array = arraylist.toArray(new String[arraylist.size()]);//converting to array
		System.out.println("Array craeted : "+Arrays.toString(array));
		
		Collections.sort(arraylist);
		System.out.println(arraylist);
		
		arraylist.clear();
		System.out.println("Aftter calling clear method : "+arraylist);
		
	}
}
