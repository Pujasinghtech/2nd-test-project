package JavaBasics;

public class ConstructorWithThisKeyword {
	
	
	String name;   // global variable
	int age;
	public ConstructorWithThisKeyword (String name,int age) {
	//	this.name= name;  // this is classvariable= localvariable
		//this.age= age;   //this is classvariable= localvariable
		//name1= name;    // localvar
		System.out.println(name);
		System.out.println(age);
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		 ConstructorWithThisKeyword obj = new  ConstructorWithThisKeyword("POO",25);

	}

}
