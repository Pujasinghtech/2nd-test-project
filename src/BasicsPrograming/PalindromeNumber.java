package BasicsPrograming;

public class PalindromeNumber {

	
		//  151 454 34543 161 78987
		
		public static void  isPalindromeNumber(int num) {
			System.out.println("given numer is:"+ num);
			
		int r=0;
		int Sum=0;
		int t;

		
		t=num;
		
		while(num>0) {
			r  =num%10; // get the remainder
			Sum = ( Sum*10)+r;
			num=num/10;
			
		}
		
		if(t==Sum) {
			System.out.println("palindrome number");
			System.out.println("not palindrome number");
		}
		
		}
		
		
		
		
		
		
		public static void main(String[] args) {

			isPalindromeNumber(151);
			isPalindromeNumber(152);
			isPalindromeNumber(34543);
			isPalindromeNumber(111);
			isPalindromeNumber(1110);
			isPalindromeNumber(0);
}
		
}