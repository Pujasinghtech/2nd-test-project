package Practice;

public class Singleton {
	//In OOP ,a sinleton class is a class that can have only once object( instance of the class)at aq time.
	//How to design sinleton class:
	//1.Make constructor as private.
//2. write a static method that has return type of object of this singleton class( lazy intialition)
	
	private static Singleton singleton_instance = null;
	public String str;
	
	private Singleton() {
		str = "Hey , i am using singlton class pattern";
	}
	public static Singleton getInstance(){
		if( singleton_instance==null)
			singleton_instance =new Singleton();
		     return singleton_instance;
		
	}
	

	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		x.str   = (x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str = (z.str).toLowerCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		
		
		
		
		


	}

}
