package BasicsPrograming;

public class PrimeNumber {

	// 2 is the lowest prime number
	//3 
		// num = 20
		public static boolean isprimeNumber(int num) {
			// edge/ corner cases:
			if (num<=1) {
				return false;
			}
			
		for(int i=2; i<num;  i++) {
			
		}
		
		for (int i=2;i<num;i++) {
			if(num% i ==0) {
				return false;
				
			}
		}
	    	return true;
		}
	    	
	    	public static void getPrimeNumbers(int num){
	    		for (int i=2; i<=num; i++) {
	    			if(isprimeNumber(i))
	    				System.out.println(i  + " ");
	    		}
	    	
		
		
	    	}
		public static void main(String[] args) {
			
			System.out.println(isprimeNumber(2));
			System.out.println("2 is prime number:"  +isprimeNumber(2));
			System.out.println("3 is prime number:"  +isprimeNumber(3));
			System.out.println("10is prime number:"  +isprimeNumber(10));
			System.out.println("17 is prime number:"  +isprimeNumber(17));
			
			System.out.println("0 is prime number:"  +isprimeNumber(0));
			System.out.println("1 is prime number:"  +isprimeNumber(1));
			System.out.println("-2 is prime number:"  +isprimeNumber(-2));
			System.out.println("13 is prime number:"  +isprimeNumber(13));
			System.out.println("19 is prime number:"  +isprimeNumber(19));
			
			getPrimeNumbers(7);
			getPrimeNumbers(13);
			getPrimeNumbers(20);
			
		}
}



		
		

		
		
		
	
		


