package operators;

public class UnaryOperator {
	
	/*incrementing/decrementing a value by one
	  negating an expression
	  inverting the value of a boolean*/
	
	//++p increment then print
	//p++ print then increment

	
	//Java Unary Operator Example: ++ and --
	public static void main(String[] args) {
		
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
		
		//Java Unary Operator Example 2: ++ and --
		int a=10;  
		int b=10;  
		System.out.println(a++ + ++a);//10+12=22  
		System.out.println(b++ + b++);//10+11=21  
		
		//Java Unary Operator Example: ~ and !
		int u=10;  
		int v=-10;  
		boolean w=true;  
		boolean d=false;  
		System.out.println(~u);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~v);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!w);//false (opposite of boolean value)  
		System.out.println(!d);//true  
		

	}

}
