package lecture_230310;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary value (0000 to 1111): ");

        String binary = input.nextLine();

        int result = 0;

        result += 1 * Integer.parseInt(String.valueOf(binary.charAt(3)));
        result += 2 * Integer.parseInt(String.valueOf(binary.charAt(2)));
        result += 4 * Integer.parseInt(String.valueOf(binary.charAt(1)));
        result += 8 * Integer.parseInt(String.valueOf(binary.charAt(0)));

        System.out.println("The decimal value is " + result);

        /*
        int binaryToInt = Integer.parseInt(binary);
        System.out.println(binaryToInt);
        */
    }
}
