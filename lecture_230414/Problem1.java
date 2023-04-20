import java.util.Scanner;
public class Problem1
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		long term = input.nextInt();
		
		if(term < 0) {
			System.out.println("The given term is not a positive integer.");
		}

		printFibo(term);
	}

    static void printFibo(long N)
    {
        long num1 = 0, num2 = 1;
        int counter = 0;
		
        while (counter < N) {
 
            // Print the number
            System.out.print(num1 + " ");
 
            // Swap
            long num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
}