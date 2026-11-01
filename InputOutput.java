import java.util.*; // importing the java util packages for the scanner utility, decided to use the astericks instead of just scanner to get int he groove to always do it. 

public class Main // Declare the main class to start writing the program
{
	public static void main(String[] args) {
		System.out.println("Enter 2 numbers to undergo artimatic operations: "); // Tell the user what the program is going to ask of them
		
		Scanner Num = new Scanner(System.in); // Creates a scanner object to be called later
       
        System.out.println("Enter the first number: "); // Tell the user to enter number 1
        
        int Num1 = Num.nextInt(); // Read the input from the user
        
        System.out.println("Enter the second number: "); // Tell the user to enter number 2 
        
        int Num2 = Num.nextInt(); // Read the input from the user  
        
        System.out.println("Number 1: " + Num1 + "\n" + "Number 2: " + Num2); // Remind the user what numbers they entered for a better display
        
        System.out.println("Your values added equal: " + (Num1 + Num2)); // Adds Num 1 and 2 then prints the value
        System.out.println("Your values multiplied equal: " + (Num1 * Num2)); // multiplies and prints the result of Num 1 and 2
        System.out.println("Your values divided equal: " + (Num1 / Num2)); // Divides num 1 and 2 then prints the remainder
        System.out.println("Your values subtracted equal: " + (Num1 - Num2)); // subtracts values and prints the sum
	}
}