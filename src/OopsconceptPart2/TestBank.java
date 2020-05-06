package OopsconceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		
		HSBCBank hs =new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationloan();
		hs.Carloan();
		
		
		// dynamic polymorphism:
		// child class object can be referred by parent interface refrence variable
 
		USBank b = new  HSBCBank();//(only overriden method allowed)
		
		b.credit();
		b.debit();
		b.transferMoney();
		
		
		
	}

}