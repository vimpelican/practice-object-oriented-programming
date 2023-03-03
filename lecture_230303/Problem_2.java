/* 
중복 답안 인정(0을 자릿수로 봐서 104의 출력값이 0이 나오도록 할지,
아니면 0을 자릿수로 판단하지 않고 4로 출력할지
*/
package lecture_230303;

public class Problem_2 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        // Read a number
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = input.nextInt();

        // Find all digits in number
        int lastDigit = number % 10; // 932 -> 2
        //int remainingNumber = ;
        int secondLastDigit = (number / 10) % 10; // 932 -> 93 -> 3
        //remainingNumber = ;
        int thirdLastDigit = number / 100; // 932 -> 9

        // Protect from being zero
        if(lastDigit == 0) {
            // lastDigit = number -> Wrong, input value 900 will print 8100
            lastDigit = 1; // ex) 900
        }
        if(secondLastDigit == 0) {
            secondLastDigit = 1; // ex) 104
        }
        if(thirdLastDigit == 0) {
            thirdLastDigit = 1; // ex) 013 == 13, output should be 3
        }

        // Obtain the multiply of all digits
        int multiply = lastDigit * secondLastDigit * thirdLastDigit;

        // Display results
        System.out.println("The multiplication of all digits in " + number + " is " + multiply);
    }
}
