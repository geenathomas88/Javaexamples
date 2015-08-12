package excercises;

import java.util.ArrayList;


public class ArrayListProblem {

	public static void main(String args[]){
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		arraylist.add(4);
		arraylist.add(5);
		arraylist.add(6);
		arraylist.add(7);
		arraylist.add(8);
		arraylist.add(9);
		arraylist.add(10);
		
		int size = arraylist.size();
		System.out.println("Size : "+ size);
		
		if(arraylist.contains(1)){
			int index = arraylist.indexOf(1);
			System.out.println("1 is present at "+index+ " position");
		}else{
			System.out.println("1 is not present");
		}
		
		int max =0,min=1;
		for(int i=0;i<arraylist.size();i++){
			if(arraylist.get(i) > max)
				max = arraylist.get(i);
		}
		System.out.println("Maximum : "+max);
		for(int i=0;i<arraylist.size();i++){
			if(arraylist.get(i) < min)
				max = arraylist.get(i);
		}
		System.out.println("Minimum : "+min);
	}
}
