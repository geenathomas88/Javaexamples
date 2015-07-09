import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import com.sun.javafx.collections.MappingChange.Map;


public class HashMapExample {

	public static void main(String args[]){
		
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		
		System.out.println("Hash map is empty : ? " +hash.isEmpty());
		
		hash.put("dog", 1);//insert
		hash.put("cat", 2);
		hash.put("cow", 3);
		hash.put("fish", 4);
		hash.put("parrot", 3);
		hash.put("hen", 5);
		
		System.out.println("Hash map is empty : ? " +hash.isEmpty());
		
		int a = hash.get("dog");//look into hash
		int b = hash.get("cat");
		
		System.out.println("HashMap : "+a +"\t" +b);
		
		Set<String> keys = hash.keySet();//get keys
		System.out.println("Print Keys:");
		for(String key : keys){
			System.out.println(key);
		}
				
		System.out.println(hash.values());//collection of values.
		
		
		if(hash.containsKey("dog")){//check for a key
			System.out.println("Key found");
		}
		
		if(hash.containsValue(3)){//check for value
			System.out.println("Value found");
		}
		
		for(String mykey : hash.keySet()){	
			if(hash.get(mykey) == 3)
			System.out.println(mykey);
		}
		java.util.Map<Integer, String> myhash = new HashMap<Integer, String>();
		
		Student s1 = new Student(1, "Student1", "A", 90);
		Student s2 = new Student(3, "Student3", "B", 80);
		Student s3 = new Student(2, "Student2", "C", 70);
		
		myhash.put(s1.id,s1.name);
		myhash.put(s2.id,s2.name);
		myhash.put(s3.id,s3.name);
		
		System.out.println(myhash.entrySet());
		
		System.out.println(myhash);
	}
	
	
	 
}
class Student{
	int id;
	String name,grade;
	float marks;
	public Student(int id, String name, String grade, float marks) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.marks = marks;
	}
	
}