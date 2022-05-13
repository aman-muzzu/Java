package methods;

//The method that does not has method body is known as abstract method. 
//In other words, without an implementation is known as abstract method. 
//It always declares in the abstract class.
//It means the class itself must be abstract if it has abstract method.
//To create an abstract method, we use the keyword abstract.

public class Method_Abstract {
	
	public static void main(String args[])  
	{  
	//creating object of abstract class  
	// Demo obj = new MyClass();  
	//invoking abstract method  
	//obj.display();  
	}  
	
		abstract class Demo //abstract class  
		{  
		//abstract method declaration  
		abstract void display();  
		}  
		
		
		public class MyClass extends Demo  
		{  
			
		//method impelmentation  
		void display()  
		{  
		System.out.println("Abstract method?");  
		}  
		
		
		}  
	}


