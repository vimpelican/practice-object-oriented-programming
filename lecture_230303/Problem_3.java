package lecture_230303;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = distance / input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double pricePerGallon = milesPerGallon * input.nextDouble();

        //Truncate again
        String costOutput = String.format("%.2f", pricePerGallon);

        System.out.println("The cost of driving is $" + costOutput);
    }
}
