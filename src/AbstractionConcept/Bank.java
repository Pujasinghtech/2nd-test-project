package AbstractionConcept;

public abstract class Bank {
	
	public abstract void loan();// abstract method---no method body
	
	
	// non abstarct method
	public void credit() {
		System.out.println("Bank--debit");
		
	}
		public void debit(){
			System.out.println("Bank--debit");
		}
	}

	

	
	
	
	
	
	
	
	
	

