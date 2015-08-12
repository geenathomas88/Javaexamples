import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
		
		System.out.println(hash.getOrDefault("monkey", -1));//get or default 
		System.out.println(hash.getOrDefault("cat", -1));
		
		hash.putIfAbsent("monkey", 5);// put if the key is absent
		hash.putIfAbsent("monkey", 6);
		System.out.println("After monkey added at position "+ hash.get("monkey"));
			
		Set<String> set = hash.keySet();//get keys
		ArrayList<String> al = new ArrayList<String>();//a new arraylist
		al.addAll(set);//add keys to arraylist
		Collections.sort(al);//sort
		
		for(String key : al){
			System.out.println(key + " : " + hash.get(key));
		}
		
		for(String mykey : hash.keySet()){	//search for key
			if(hash.get(mykey) == 3)
			System.out.println(mykey);
		}
		
		System.out.println("Using map.entry");
		for(Map.Entry m:hash.entrySet()){//using Map.Entry
			System.out.println(m);
		}
		
	}	 
}
