package operators;

public class ArthamaticOperator {

	public static void main(String[] args) {
		//Java Arithmetic Operator Example
		int a = 20;
		int b = 30;
		int c=  40;
		
		System.out.println(a+b);  //500
		System.out.println(a-b);  //-100
		System.out.println(a*b);  //60000
		System.out.println(a/b);  //0
		System.out.println(a%b);  //200
		
		//Java Arithmetic Operator Example: Expression
		System.out.println(10*10/5+3-1*4/2);  //200 bodmas RULE
		
		//Java Left Shift Operator Example
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240  
		
		//Java Right Shift Operator Example
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2  
		
		//Java Shift Operator Example: >> vs >>>
		//For positive number, >> and >>> works same  
	    System.out.println(20>>2);  
	    System.out.println(20>>>2);  
	    //For negative number, >>> changes parity bit (MSB) to 0  
	    System.out.println(-20>>2);  
	    System.out.println(-20>>>2);  
	    
	    //Java AND Operator Example: Logical && and Bitwise &     --->int a=10,b=20,c=30
	    System.out.println(a<b && a<c);//true && true = true  
	    System.out.println(a<b & a<c);//true & true = true  
		
	    //Java AND Operator Example: Logical && vs Bitwise &     ---->int a=10,b=20,c=30
	    System.out.println(a<b && a++<c);//True && true = true  
	    System.out.println(a);//21 because second condition is not checked  
	    System.out.println(a<b & a++<c);//True && true = true  
	    System.out.println(a);//21 because second condition is checked  
	    
	    //Java OR Operator Example: Logical || and Bitwise |     ---->int a=10,b=20,c=30
	    System.out.println(a>b || a<c);//false || true = true  
	    System.out.println(a>b | a<c);//false | true = true  
	    //|| vs |  
	    System.out.println(a>b || a++<c);//true || true = true  
	    System.out.println(a);//23 because second condition is not checked  
	    System.out.println(a>b | a++<c);//true | true = true  
	    System.out.println(a);//24 because second condition is checked  


	}

}
