package operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		//Java Assignment Operator Example
		int a=10;  
		int b=20;  
		a+=4;//a=a+4 (a=10+4)  14
		b-=4;//b=b-4 (b=20-4)  16
		System.out.println(a);  
		System.out.println(b);  
		
		//Java Assignment Operator Example
		a+=3;//10+3  
		System.out.println(a);   //13
		a-=4;//13-4  
		System.out.println(a);   //9
		a*=2;//9*2  
		System.out.println(a);  //18
		a/=2;//18/2  
		System.out.println(a);  //9
		
		//Java Assignment Operator Example: Adding short
		
		short x=10;  
		short y=10;  
		//a+=b;//a=a+b internally so fine  
		a=x+y;//Compile time error because 10+10=20 now int  
		System.out.println(x);  
		
		//type casting
		a=(short)(x+y);//20 which is int now converted to short  
		System.out.println(x);  
		
		
		}

	}


