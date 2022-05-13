package controlstatements;

public class If_Else_If_ladderStatement {
	
	 /* if(condition 1) {    
		statement 1; //executes when condition 1 is true   
		}  
		else if(condition 2) {  
		statement 2; //executes when condition 2 is true   
		}  
		else {  
		statement 2; //executes when all the conditions are false   
		}  
	 */

	public static void main(String[] args) {
		String city = "agra"; 
		
		if(city == "Meerut") {  
		System.out.println("city is meerut");  
		
		}else if (city == "Noida") {  
		System.out.println("city is noida");  
		
		}else if(city == "Agra") {  
		System.out.println("city is agra");  
		
		}else {  
		System.out.println(city);  
		}

	}

}
