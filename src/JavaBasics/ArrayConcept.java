package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		
		
		
		//array : to store similar data values in a array variable
		//1. int array;
		//lowest bound/ index= 0
		//upper bound /indx= n-1(n is size of array) 3.
		// one dimensional array
		// dis- advantage of array
		//1. size of fixed --static array --to overcome of this problem --we use collection-- Arraylist, Hashtable--USE ynemic array
		//stores only similar data types-- to overcome of this problem,we can use object array.
		
		int i[]= new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println(i[1]);
		System.out.println(i[0]);
		//System.out.println(i[4]);//Array Index out of BoundException
		System.out.println(i.length);//size/ length of array
		
		
		//print all the values of array : use for loop
		for( int j=0;j<i.length;j++) {   // i .length is size of array=4 
			System.out.println(i[j]);
		}
		 
		// Double array:
		double d[]= new double[3];
		d[0] =12.33;
		d[1]=13.45;
		d[2]=14.33;
		System.out.println(d[2]);
		
		////3. char array
		char c[]= new char[3];
		c[0]='&';
		c[1]= '%';
		c[2]='@';
		System.out.println(c[2]);
		
		// 4. Boolean array:
		boolean b[]=new boolean[2];
		b[0]= true;
		b[1]=false;
		System.out.println(b[0]);
		
		
		// 5. strings array:
		
		String s[]= new String[2];
		s[0]= "test";
		s[1]="hello";
		System.out.println(s[1]);
		System.out.println(s.length);
		
		//6. object array: (object is class)-- is used to store different data types values
		Object ob[]= new Object [6];
		ob[0]="papa";
		ob[1]=45;
		ob[2]=12.33;
		ob[3]="1/12/1998";
		ob[4]="male";
		ob[5]="london";
		System.out.println(ob[4]);
		System.out.println(ob.length);
		
		
		
				
				
		
}

}
