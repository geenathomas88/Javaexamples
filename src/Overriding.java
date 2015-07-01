
public class Overriding {
	public static void main(String args[]){
		GrandMother grandmother = new GrandMother();
		grandmother.sayHi();
		int age = grandmother.getAge();
		System.out.println(age);
		grandmother.getName();
		
		Mother mom = new Mother();
		mom.sayHi();
		mom.getName();
		
		Mother mother = new Daughter();
		mother.sayHi();
		mother.getAge();
		mother.getName();
		
		Son son = new Son();
		son.sayHi();
		son.getAge();
	}
}
class GrandMother{
	public void sayHi(){
		System.out.println("Hi from Grandmother");
	}
	int getAge(){
		System.out.println("Grandmother's age:");
		return 95;
	}
	GrandMother getName(){
		return new GrandMother();
	}
}
class Father extends GrandMother{
	
}
class Mother extends GrandMother{
	public void sayHi(){
		System.out.println("Hi from Mother");
	}	
	GrandMother getName(){
		return new GrandMother();
	}
}
class Baby extends Mother{
	GrandMother getName(){
		return new GrandMother();
	}
}
class Daughter extends Mother{
	public void sayHi(){
		System.out.println("Hi from Daughter");
	}
}

class Son extends Mother{
	public void sayHi(){
		System.out.println("Hi from Son");
	}
	int getAge(){
		System.out.println("Age method of son");
		return 1;
	}
}