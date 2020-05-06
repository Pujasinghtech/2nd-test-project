package OOPConcept1;

public class StaticAndNonStaticconcept {
	
	String name= "sanju";// non- static global variable
    static int age = 25;// static global variable

	public static void main(String[] args) {
		// how to call static methods and variable?
		// 1. Direct calling:
		sum();
		//2. calling by classname:
		StaticAndNonStaticconcept.sum() ;
		System.out.println(age);
		System.out.println(StaticAndNonStaticconcept.age );
		
		//How to call non static method and vars:
		StaticAndNonStaticconcept obj = new StaticAndNonStaticconcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		// can i acess static method by using object refrence? yes
		
		obj.sum();// warning will be given( but it not a good practise)
		
		
		

	}
	
	public void sendMail() {// non static method
		System.out.println("send mail method");
	}

	public static void sum() {// static method
		System.out.println("sum method");
	}
}
