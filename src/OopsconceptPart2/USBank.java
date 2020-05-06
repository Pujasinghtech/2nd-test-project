package OopsconceptPart2;

public interface USBank {
	
	int min_bal=100;
	
	public void credit();
	
	public void debit();
	
	public  void transferMoney();
	
	
//only method declaration
	
// no method body- only method prototype
// in Interface , we can declare the variables , variables are by default static in nature
// varbiles ,value will not be changed.( ex: min balnce not changed remains 100).its final/constant in nature.
// No static method in interface 
// No main method in interface
// we can not create the object of interface
// interface  is in abstact nature.(abstract means initiate)we can not create object variables
	
	
	

}
