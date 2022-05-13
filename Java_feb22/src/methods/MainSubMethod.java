 package methods;

public class MainSubMethod {

	
	// what ever we have written in sub method should be called in main method with method name.
	//OP will be blank because there is nothing in main method see below EX:, as told execution will start from main method.
    //EX:	public static void main(String[] args) {	}
	// in order to call sub method we need to create object in main method.
	
	// we can create number of methods, but should be called in main method.
	
	public static void main(String[] args) {
		
		MainSubMethod obj= new MainSubMethod();
		obj.addtwoNumbers();
		
		
	}
	
	void addtwoNumbers(){
		
		int a=10;
		int b=50;
		int c= a+b;
		
		System.out.println("Add 2 numbers: "+c);
		
		
	}
	
	

}
