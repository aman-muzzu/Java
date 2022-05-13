package methods;

import java.util.Scanner;

public class MethodSeperatePrintResult {

	public static void main(String[] args) {
		
		MethodSeperatePrintResult obj =new MethodSeperatePrintResult();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first value: ");
		
		int x= sc.nextInt();		
		System.out.println("Enter second value:");
		int y =sc.nextInt();
		
		obj.addTwoNumbers(x, y);       // calling 1st method
		obj.printAdditionResults(x,y); // calling 2nd method
		
		System.out.println("Addition of two number is: "+ (x+y));

	}

	
	public int addTwoNumbers(int v1, int v2){
		
		int Add= v1+v2;
		
		return Add;
		
	}
	
	void printAdditionResults(int x, int y) {
		System.out.println(x);
		
		
	}
}
