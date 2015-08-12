package excercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesAndUniques {

	public static void main(String args[]){
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(7);
		
		Set<Integer> set = new HashSet<Integer>();
		System.out.println("Duplicates : ");
		for(int i =0; i< al.size(); i++){
			if(!set.add(al.get(i)))					//returns true if the element is already present
				System.out.println(al.get(i));		//print repeated elements
		}
		
		System.out.println("Uniques : "+set);

	}
}
