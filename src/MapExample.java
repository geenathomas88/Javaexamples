import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class MapExample {

	public static void main(String args[]){
		Map<Integer, Student> myhash = new HashMap<Integer, Student>();
		
		Student s1 = new Student(01, "Student1", 'A', 90);
		Student s2 = new Student(03, "Student3", 'B', 80);
		Student s3 = new Student(02, "Student2", 'C', 70);
		Student s4 = new Student(04, "Student1", 'A', 90);
		
		myhash.put(s1.id,s1);
		myhash.put(s4.id,s2);
		myhash.put(s2.id,s3);
		myhash.put(s3.id, s4);
		
		System.out.println(myhash.entrySet());//print hash of students
		
		System.out.println(myhash);//print the whole hash
		
		Iterator<Entry<Integer,Student>> it = myhash.entrySet().iterator();//iterate through the hashmap
		while(it.hasNext()){
			Entry<Integer, Student> e = it.next();
			System.out.println(myhash.get(e.getKey()));
		}
		
		System.out.println("My hashcode for s1: "+s1.hashcode());
		System.out.println("My hashcode for s4: "+s4.hashcode());
		System.out.println("Java hashcode for s1: "+s1.hashCode());
		System.out.println("Java hashcode for s4: "+s4.hashCode());
		
		if(s1.equals(s4)){
			System.out.println("They are equal");
		}else{
			System.out.println("They are not equal");
		}
		
//SORTING		
		System.out.println("HashMap before sorting, random order ");
		Set<Entry<Integer, Student>> entry = myhash.entrySet();
		for(Entry<Integer, Student> e : entry){
			System.out.println(e.getKey() + " ==> " + e.getValue());
		}
		System.out.println("HashMap after sorting by keys in ascending order ");
		TreeMap<Integer, Student> sortedTree = new TreeMap<Integer, Student>(myhash);
		Set<Entry<Integer, Student>> sortedEntry = sortedTree.entrySet();
		for(Entry<Integer, Student> e : sortedEntry){
			System.out.println(e.getKey() + " ==> " + e.getValue());
		}
		
		Comparator<Entry<Integer, Student>> valueComparator = new Comparator<Map.Entry<Integer,Student>>() {

			public int compare(Entry<Integer, Student> o1,
					Entry<Integer, Student> o2) {
				Student s1 = o1.getValue();
				Student s2 = o2.getValue();
				return s1.name.compareTo(s2.name);				
			}
		};
		
		List<Entry<Integer, Student>> listOfEntries = new ArrayList<Entry<Integer,Student>>(entry);
		Collections.sort(listOfEntries, valueComparator);
		LinkedHashMap<Integer, Student> sortedByValue = new LinkedHashMap<Integer, Student>(listOfEntries.size());
		for(Entry<Integer, Student> e :listOfEntries){
			sortedByValue.put(e.getKey(), e.getValue());
		}
		System.out.println("HashMap after sorting entries by values ");
		Set<Entry<Integer, Student>> entrySetSortedByValue = sortedByValue.entrySet();
		for(Entry<Integer, Student> sorted :entrySetSortedByValue ){
			System.out.println(sorted.getKey() + " == > " + sorted.getValue());
		}
	}
}
class Student{
	int id;
	String name;
	char grade;
	float marks;
	public Student(int id, String name, char grade, float marks) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade
				+ ", marks=" + marks + "]";
	}
	public int hashcode(){
		return id;
	}
	public boolean equals(Student s){
		if(this.name == s.name)
			return true;
		else
			return false;
	}
	
}

