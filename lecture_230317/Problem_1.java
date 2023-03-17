package lecture_230317;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();

        // 예외 처리 : 1보다 작거나, 15보다 크다면
        if(numberOfLines < 1 || numberOfLines > 15) {
            System.out.println("You must enter a number from 1 to 15");
            System.exit(1);
        }
        
        //줄을 하나씩 출력하면서 내려간다
        for(int row = numberOfLines; row >= 1; row--) {
            // 시작하는 숫자부터 1까지 출력
            for(int numberDecresing = row; numberDecresing >= 1; numberDecresing--) {
                //println 사용하면 한 줄씩 출력되어 결과 형식과 맞지 않음 -> print 사용
                System.out.print(numberDecresing + "  ");
            }
            // 2부터 시작하는 숫자까지 출력
            for(int numberIncreasing = 2; numberIncreasing <= row; numberIncreasing++) {
                System.out.print(numberIncreasing + "  ");
            }

             // 줄을 구별하기 위해 개행 문자 출력
            System.out.print("\n");
        }

        
    }
}
