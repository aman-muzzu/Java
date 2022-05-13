package methods;

/*
 INSTANCE METHODS ARE OF 2 TYPES: 1. Accessor Method,  2.Mutator Method
  1)Accessor Method    

  public int getId()    
{    
return Id;    
}    
  
   2)Mutator Method
   
  public void setRoll(int roll)   
{  
this.roll = roll;  
} 
*/

public class Method_typesofInstanceMethod {   // let class name be Student
	private int roll;
	private String name;

	public int getRoll() // accessor method
	{
		return roll;
	}

	public void setRoll(int roll) // mutator method
	{
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("Roll no.: " + roll);
		System.out.println("Student name: " + name);
	}

}
