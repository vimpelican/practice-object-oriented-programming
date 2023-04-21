import java.util.Scanner;
public class Problem2 {
	public static void main(String args[]) {
		int input;		
		Scanner s = new Scanner(System.in);
		input = s.nextInt();
		
		boolean flag = checkPrime(input);
		
		if(flag)	{
			System.out.println("The " + input + " is a prime number.");
		}
		else {
			System.out.println("The " + input + " is not a prime number.");
		}
	}
	
	public static boolean checkPrime(int number) {
		if (number < 2) {
		  return false;
		}
	
		if (number % 2 == 0) {
			return number == 2;
		}
	
		int limit = (int)(0.1 + Math.sqrt(number));
		for (int i = 3; i <= limit; i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}