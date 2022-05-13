package controlstatements;

public class LoopStatements {

	public static void main(String[] args) {
		
		//Java for loop
	
		 /* for(initialization, condition, increment/decrement) {    
			//block of statements    
				}    */
		
		
		int sum = 0;  
		for(int j = 1; j<=10; j++) {  
		sum = sum + j;  
		}  
		System.out.println("The sum of first 10 natural numbers is " + sum);  
		
		
		//Java for-each loop

		/* for(data_type var : array_name/collection_name){    
			//statements    
			}    
		 */
		String[] names = {"Java","C","C++","Python","JavaScript"};    
		System.out.println("Printing the content of the array names:\n");    
		for(String name:names) {    
		System.out.println(name);    
		}    
		
		//Java while loop
		/*while(condition){    
			//looping statements    
			}     
		 */
		
		int i = 0;    
		System.out.println("Printing the list of first 10 even numbers \n");    
		while(i<=10) {    
		System.out.println(i);    
		i = i + 2;    
		}    
		
		//Java do-while loop
		/*do     
			{    
			//statements    
			} while (condition);    
		 */
		
		int M= 0;    
		System.out.println("Printing the list of first 10 even numbers \n");    
		do {    
		System.out.println(M);    
		M = M + 2;    
		}while(M<=10);    
		
		//Java  Jump and   break statement
		
		for(int k = 0; k<= 10; k++) {  
			System.out.println(k);  
			if(k==6) {  
			break;  
			}  
			}  
		
     //break statement example with labeled for loop

		//Calculation.java
		
		a:    
			for(int p = 0; p<=10; p++) {    
			b:    
			for(int q = 0; q<=15; q++) {    
			c:    
			for (int r = 0; r<=20; r++) {    
			System.out.println(r);    
			if(r==5) {    
			break a;    
			}    
			}    
			}    
			    
			}  
		    
		    //Java continue statement

			for(int x= 0; x<= 2; x++) { 
					for (int y = i; y<=5; y++) {  
						if(y == 4) {  
							continue;  
						}  
						System.out.println(y);  
					}  
			}  
		    
		    	

	}

}
