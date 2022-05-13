package methods;

import java.util.Scanner;

public class MethodSoftcodingvalues {

	public static void main(String[] args) {
		
		MethodSoftcodingvalues obj = new MethodSoftcodingvalues();
		
		Scanner scan= new Scanner(System.in);    // this is imp to know for softcoding values need to create scanner obj
		
		//scan.nextInt();// we can call any method type like scan.nextDouble();  scan.nextInt();  scan.next();...etc
		scan.nextInt();
		System.out.println("Please enter First number: ");
		int a = scan.nextInt();
		System.out.println("Please enter Second number: ");
		int b = scan.nextInt();
		
		
		obj.addTwovalues(a,b);
		
		System.out.println("Sum of 2 softcoding values are ");
		
		
		

	}
	
	
	public  int addTwovalues( int a, int b){
		
		int Sum= a+b;
		return Sum;
	
		
	}

}
