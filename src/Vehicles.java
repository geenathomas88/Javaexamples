//Constructors, final and static
public class Vehicles {	
	public static void main(String args[]){
		System.out.println("Car has "+Car.WHEELSOFCAR+" wheels");
		Car toyota = new Car("Corolla");
		toyota.run(toyota.name);
		Car bmw = new Car();
		bmw.run(bmw.name);
		Car honda =	new Car("Civic",2015,"LE",200);
		honda.run(honda.name);
		
		Train chennaimail = new Train("Chennai Mail", 1987);
		System.out.println(chennaimail.name+","+chennaimail.make);
		Train venad = new Train("Venad Express", 1956,"90");
		System.out.println(venad.name+","+venad.make+","+venad.model);
		System.out.println("Total Vehicles made: "+Vehicle.noOfVehicles);
	}
}
class Vehicle{
	int make,mileage;
	String name,model;
	public static int noOfVehicles;	//class variable
	void run(){
		System.out.println("Vehicle is running");
	}
}
class Car extends Vehicle{
	final static int WHEELSOFCAR = 4;//constatnt
	
	Car(){
		name = "BMW";
		noOfVehicles++;
		System.out.println("A new car is made, it is by default "+name);
	}
	Car(String n){
		name = n;
		noOfVehicles++;
		System.out.println("A new car is made, it is a "+name);
	}
	Car(String n,int m,String mo,int mi){
		name = n;
		make = m;
		model = mo;
		mileage = mi;
		noOfVehicles++;
		System.out.println("A new car is made, it is a "+name+","+model +" model"+", "+ make+ " make");
	}
	void run(String carName){
		super.run();
		System.out.println(carName +" is running");
	}
}
class Train extends Vehicle{
	final static int wheelsOfTrain = 10;
	Train(String n,int m){
		name = n;
		make = m;
		noOfVehicles++;
	}
	Train(String n,int m,String mo){
		name = n;
		make = m;
		model = mo;
		noOfVehicles++;
	}
	
}