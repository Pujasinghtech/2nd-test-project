package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		
		
		ArrayList ar =new ArrayList();
		ar.add(100);//index0
		
		ar.add(200);// 1
		
		ar.add(300);//2
		
		System.out.println(ar.size());
		
		
		ar.add(400);//3
		
		ar.add(500);//4
		System.out.println(ar.size());
		
		
		ar.add("Tom");//5
		ar.add("helo");//6
		ar.add("12.33");//7
				
		ar.add("female");//8
		System.out.println(ar.size());
		
		
		System.out.println(ar.get(4));
		System.out.println(ar.get(5));
		
		
		//to print all the values of Arraylist:for loop
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}

		ArrayList<Integer>ar1=new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add('M');
		
		
		ArrayList<String>ar2=new ArrayList<String>();
		ar2.add("Tom");
		//ar2.add('100');
	}

}
