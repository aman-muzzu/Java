package controlstatements;

public class SwitchStatement {
	
	 /* switch (expression){  
    case value1:  
     statement1;  
     break;  
    .  
    .  
    .  
    case valueN:  
     statementN;  
     break;  
    default:  
     default statement;  
}  
	 */

	public static void main(String[] args) {
		int num = 555;  
		switch (num){  
		case 0:  
		System.out.println("number is 0");  
		break;  
		case 1:  
		System.out.println("number is 1");  
		break;  
		default:  
		System.out.println(num);  
		}  

	}

}
