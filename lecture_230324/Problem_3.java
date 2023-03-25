package lecture_230324;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int SIZE = 3;
        System.out.print("Enter a 3 by 3 matrix row by row: ");
        double[][] m = new double[SIZE][SIZE];

        for(int i = 0; i < SIZE; i++)
            for(int j = 0; j < SIZE; j++)
                m[i][j] = input.nextDouble();
        
        if(isMarkovMatrix(m))
            // print 사용하면 출력이 It is a Markov matrix% 로 나옴
            System.out.println("It is a Markov matrix");
        else
            System.out.println("It is not a Markov matrix");
    }

    public static boolean isMarkovMatrix(double[][] m) {
        // 각 열별로 합 계산
        double sumOfFirstColumn = m[0][0] + m[1][0] + m[2][0];
        double sumOfSecondColumn = m[0][1] + m[1][1] + m[2][1];
        double sumOfThirdColumn = m[0][2] + m[1][2] + m[2][2];
    
        // Markov Matrix의 정의(각 열 합 1)에 맞는지 확인
        if(sumOfFirstColumn == 1.0 && sumOfSecondColumn == 1.0 && sumOfThirdColumn == 1.0)
            return true;
        else
            return false;
    }
}
