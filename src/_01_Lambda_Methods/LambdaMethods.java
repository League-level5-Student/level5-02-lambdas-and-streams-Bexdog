package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < s.length(); i++) {
				if(s.substring(i, i+1).equals("a")) {
					
				}
				else if(s.substring(i, i+1).equals("e")){
					
				}
				else if(s.substring(i, i+1).equals("i")){
					
				}
				else if(s.substring(i, i+1).equals("o")){
	
				}
				else if(s.substring(i, i+1).equals("u")){
	
				}
				else {
					System.out.println(s.charAt(i));
				}
			}
		}, "cool");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
