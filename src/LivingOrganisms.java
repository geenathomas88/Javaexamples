import java.util.Calendar;

public class LivingOrganisms {
	

	public static void main(String args[]) {
		Bird bird = new Bird();
		bird.color = "green";
		bird.whichBird();
		bird.fly();
		
		System.out.println("------------------");
		
		Fish fish = new Fish();
		fish.swim();
		
		System.out.println("------------------");
		
		Animal animal = new Animal();
		animal.isAPet= true;
		animal.typeOfAnimal();
		
		System.out.println("------------------");
		
		Humans human = new Humans();
		human.name = "Geena";
		human.gender = 'f';
		human.yob = 1988;
		human.getAge();
		human.who();
	}
}

class Bird{
	String color;
	
	void whichBird(){
		if(color == "green"){
		System.out.print("I am a parrot. ");
		}else if(color == "black"){
			System.out.print("I am a crow. ");
		}else if(color == "white"){
			System.out.print("I am a sparrow. ");
		}else{
			System.out.print("I am a " + color + "bird. ");
		}
	}
	void fly(){
		System.out.println("I can fly");
	}
}

class Fish{
	int fins;
	
	void swim(){
		System.out.println("I can swim");
	}
}

class Animal{
	boolean isAPet;
	
	void typeOfAnimal(){
		if (isAPet){
			System.out.println("I am a Domestic animal");
		}else{
			System.out.println("I a wild animal");
		}
	}
}


class Humans{
	int yob;
	int age;
	String name;
	char gender;
	String  value;
	
	void getAge(){
		age = (Calendar.getInstance().get(Calendar.YEAR))-yob;
	}
	void who(){
		if (gender== 'f'){
			value ="girl";
		}
		else{
			value ="boy";
		}
		System.out.println("I am a " + value + ". My name is " + name + ". I am " + age + " years old.");
	}

}


