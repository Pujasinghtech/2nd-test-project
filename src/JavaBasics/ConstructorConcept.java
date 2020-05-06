package JavaBasics;

public class ConstructorConcept {

	public ConstructorConcept() {              // 0 parameter
		System.out.println("Default const");
	}
	
	public ConstructorConcept(int i) {                   // 1 parameter
		System.out.println("single param constructor");
		System.out.println("the value of i " +i);
	}
	public ConstructorConcept(int i,int j) {               // 2 parameter
		System.out.println("two param constructor");
		System.out.println("the value of i " +i);
		System.out.println("the value of i " +j);

		
	}
	
	public ConstructorConcept(String name, int age) { // this.classvar= localvar
	 
	 
	}
 public static void main(String[]args) {
	 ConstructorConcept obj= new ConstructorConcept();
	 ConstructorConcept obj1= new ConstructorConcept(10);
	 ConstructorConcept obj2= new ConstructorConcept(10,20);
	 ConstructorConcept obj3= new ConstructorConcept("Tom",20);
	 
	 
	 
	 }
	 }
 

