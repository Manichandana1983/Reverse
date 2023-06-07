package reverse;
import java.util.Scanner;
public class Reversenum {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        int reverse = 0;
	        while (number != 0) {
	            int remainder = number % 10;
	            reverse = reverse * 10 + remainder;
	            number /= 10;
	        }
	        
	        System.out.println("The reverse of the number is: " + reverse);
	   


	}

}
