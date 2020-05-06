package OOPConcept1;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading obj = new MethodOverLoading();
		obj.sum();
		obj.sum(20);
		obj.sum(20,5);
	}
		public static void main(int p) {
			

	}
		
		public static void main(int q,int h) {
			
		}
	// we can overload main method also.	
// you can not create a method inside a method
	// duplicate method--> same method name with same no of arguments are not allowed
	// Method overloading---> when the method name is same with arguments or input parameter within the class.
	
	public void sum() { // 0 parameter
		System.out.println("sum method----zero parameter");
	}
	
	public void sum(int i) { // 1 input parameter
		System.out.println("sum method--- 1 input parameter");
		System.out.println(i);
		
	}
	
	public void sum(int k, int l) { // 2 input parameter
		System.out.println("sum method -- 2 parameter");
		System.out.println(k+l);
	}
	
	
	
}
