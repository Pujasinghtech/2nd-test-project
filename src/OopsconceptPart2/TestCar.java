package OopsconceptPart2;

public class TestCar {
	
	// WHEN SAME METHOD IS PRESENT IN PARENT CLASS AS WELL IN CHILD CLASS WITH THE SAME NAME AND SAME NUMBER OF ARGUMENTS
// is called Method - overriding
	public static void main(String[] args) {
		
		// static polymorphism-- compile time polymorphism
		BMW b = new BMW();
		b.start();
		
		b.stop();
		b.refuel();
		b.thesafety();
		b.engine();
		
		System.out.println("**********");
		
		Car c = new Car();
		c.Start();
		c.stop();
		c.refuel();
		
		System.out.println("********");
		
		Car c1 = new BMW();// child class object can be reffered by parent class refrence variable -- dynamic polymorphism ---> Run time polymorphism
			c1.Start();
			c1.stop();
			c1.refuel();
			
			// Down-casting
			BMW b1 = (BMW)new Car();// classcastexception
		}

	}


