package JavaBasics;

public class TowDimArray {

	public static void main(String[] args) {
		
		
		String x[][]= new String[3][5];
		System.out.println(x.length);// 3 ---total no of rows=3
		System.out.println(x[0].length);// 5 -=-total no of coulumns =5
		System.out.println(x[1].length);// total no of cols =5
		
		// Row.1
	
		x[0][0] ="A";
		x[0][1] = "B";
		x[0][2] ="c";
		x[0][3] ="D";
		x[0][4]="E";
		
		// ROW.2
		x[1][0]= "A1";
		x[1][1]= "A2";
		x[1][2]="A3";
		x[1][3]="A4";
		x[1][4]="A5";
		
		//ROW.3
		x[2][0]= "A2";
		x[2][1]= "B2";
		x[2][2]= "C2";
		x[2][3]= "D2";
		x[2][4]= "E2";
		
		System.out.println(x[0][2]); // ROW1
		System.out.println(x[0][3]);
		
		System.out.println(x[1][2]);//ROW 2
		System.out.println(x[1][4]);
		
		System.out.println(x[2][2]); // Row 3
		System.out.println(x[2][4]);
		
		// print all the values of 2d array: use for loop:
		//row=0,col=0 to 4
		//row=1 ,col=0to 4
		//row=2 , col = 0 to 4
		for(int row=0;row<x.length;row++) 
		for(int col=0;col<x[0].length;col++) {
			
			System.out.println(x[row][col]);
		}
		
		
		}
		
	

	}


