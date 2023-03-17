package lecture_230310;

public class Problem_2 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        String resultAnd = number % 4 == 0 && number % 5 == 0 ? "true" : "false";
        String resultOr = number % 4 == 0 || number % 5 == 0 ? "true" : "false";
        String resultXor = number % 4 == 0 ^ number % 5 == 0 ? "true" : "false";


        System.out.println("Is " + number + " divisible by 4 and 5? " + resultAnd);

        System.out.println("Is " + number + " divisible by 4 or 5? " + resultOr);

        System.out.println("Is " + number + " divisible by 4 and 5, but not both? " + resultXor);
    }
}
