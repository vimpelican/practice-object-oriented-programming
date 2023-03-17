package lecture_230317;

public class Problem_2 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter line number: ");
        int lineNumber = input.nextInt();

        displayPattern(lineNumber);
    }

    public static void displayPattern(int n) {
        // 한 줄씩 출력
        for(int row = 1; row <= n ; row++) {
            // n번째 줄에서 1씩 줄어들면서 출력
            for(int count = row; count >= 1 ; count--) {
                System.out.print(count + " ");
            }
            // 구별 위한 개행문자 출력
            System.out.print("\n");
        }
    }
}
