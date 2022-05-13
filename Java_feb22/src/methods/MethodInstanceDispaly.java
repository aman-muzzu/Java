package methods;

/*
 * There are two types of instance method:
  1)Accessor Method
  2)Mutator Method
 */

public class MethodInstanceDispaly {

	public static void main(String[] args) {
		{  
			//Creating an object of the class  
			MethodInstanceDispaly obj = new MethodInstanceDispaly();  
			//invoking instance method   
			System.out.println("The sum is: "+obj.add(12, 13));  
			}  
		int s;
			 
	}
			//user-defined method because we have not used static keyword  
	public int add(int a, int b) {
		 int s = a + b;
		// returning the sum
		return s;

	}
	
}

