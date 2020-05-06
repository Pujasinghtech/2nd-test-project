package OopsconceptPart2;

public class HSBCBank implements USBank,BrazilBank  { //we are achieving  multiple inhertince 
	// Is- a Reation-ship( interface of class) mens implemtns of class.
	
// if a class is implementing any interface .then its mandotary to all define /overide all the methods of interface
	// these 3 method are overriding from USBank
	public void credit() {
		System.out.println("hsbc---credit");
	}
		


	public void debit() {
		System.out.println("hsbc---debit");
		
	}

	public  void transferMoney() {
		System.out.println("hsbc---transferMoney");
}
 // these 2 method are seprate method of HSBCBank class.
	public void educationloan() {
		System.out.println("hsbc edu ---loan");
}
	
	public void Carloan() {
		System.out.println("hsbc--car loan");
	}
	
	
	// brazil Bank method:overriding from Brazilbank
	public void mutualFund() {
		System.out.println("hsbc--- mutual fund");
	}
	}