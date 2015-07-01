import java.util.Calendar;

public class LivingOrganismsInheritence {
	
	final boolean LIVE =true;
	
	void breathe(){
		System.out.println("I can breathe!");
	}
	void food(){
		System.out.println("I need food to live!");
	}
	public static void main(String args[]){
		Plants plant = new Plants();
		plant.food();
		
		Animals animal = new Animals();
		animal.breathe();
		animal.eat();
		animal.food();
		
		WildAnimals wild = new WildAnimals();
		wild.breathe();
		wild.live();
		wild.move();
		
		DomesticAnimals domestic = new DomesticAnimals();
		domestic.live();
		domestic.move();
	}
}
class Plants extends LivingOrganismsInheritence{
	void food(){
		System.out.println("I make my own food!");
	}
}
class Animals extends LivingOrganismsInheritence{
	
	void move(){
		System.out.println("I can move!");
	}
	void eat(){
		System.out.println("I depend on others for food!");
	}	
	void reproduce(){
		System.out.println("I can reproduce!");
	}
}
class WildAnimals extends Animals{
	int noOfLegs = 4;
	
	void live(){
		System.out.println("I live in wild areas!");
	}
	void move(){
		System.out.println("I walk with "+ noOfLegs +"!");
	}
}
class DomesticAnimals extends Animals{
	
	void live(){
		System.out.println("I live in homely areas!");
	}
}
class Human extends Animals{
	
	int noOfLegs = 2;
	
	void live(){
		System.out.println("I live in homes!");
	}
	void move(){
		System.out.println("I walk with "+ noOfLegs +"!");
	}
	int getAge(int yob){		
		int age;
		age=(Calendar.getInstance().get(Calendar.YEAR))-yob;
		return age;
	}
}
class Male extends Human{
	String name;
	
	String getName(String name){
		return name;
	}
}