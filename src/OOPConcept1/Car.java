package OOPConcept1;

public class Car {
	// class vars:
	
	int mod;
	int wheel;

	public static void main(String[] args) {
		// newCar();-- this is the object off car class
		//new keyword is used to create the object
		//a,b,c,----> object reference variables
		 
		Car a = new Car();
		Car b = new Car();
		Car c= new Car();
		
		
	a.mod = 2012;
	a.wheel= 4;
	
	b.mod = 2013;
	b.wheel= 4;		
		
	c.mod= 2014;
	c.wheel=4;
	
	System.out.println(a.mod);
	System.out.println(a.wheel);
	
	System.out.println(b.mod);
	System.out.println(b.wheel);
	
	System.out.println(c.mod);
	System.out.println(c.wheel);

	a.mod= 10;
	System.out.println(a.mod); // 10
	c.mod=20;
	System.out.println(a.mod);//20
	System.out.println(c.mod);
	}

}
