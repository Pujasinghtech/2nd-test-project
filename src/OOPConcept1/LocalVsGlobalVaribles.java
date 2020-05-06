package OOPConcept1;

public class LocalVsGlobalVaribles {

	
	// GLOBAL VARIbles---> class variables
	
     String name ="pihu";
     int age = 24;

	public static void main(String[] args) {
		int i = 10; // local var for main method
		System.out.println(i);
	LocalVsGlobalVaribles obj= new 	LocalVsGlobalVaribles();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
	}
		
    public void sum() { // local var for sum method
    	int i =10;
    	int j=20;
    	int age = 25;
    
	}

}
