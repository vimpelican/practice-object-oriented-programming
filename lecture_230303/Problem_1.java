/* 폴더로 관리하기 위하여 추가함
 * ref_1) https://stackoverflow.com/questions/9510932/java-package-vs-folder-structure-what-is-the-difference
 * ref_2) https://soshace.com/organize-your-java-code-using-packages/
 */
package lecture_230303;

public class Problem_1 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a miles: ");
        double miles = input.nextDouble();

        double kilometers = 1.6 * miles;

        // Truncate unnecessary decimal 0's
        // ref) https://stackoverflow.com/questions/703396/how-to-nicely-format-floating-numbers-to-string-without-unnecessary-decimal-0s
        String kilometersOutput = String.format("%.1f", kilometers);

        System.out.print(miles + " miles is " + kilometersOutput + " kilometers");
    }
}