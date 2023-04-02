package lecture_230331;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print
            ("Enter the number of rows and columns of the array: ");
        
        int numberOfRows = input.nextInt();
        int numberOfColumns = input.nextInt();
        double[][] a = new double[numberOfRows][numberOfColumns];
        
        // 2차원 배열을 입력받음
        System.out.println("Enter the array: ");
        for(int i = 0; i < numberOfRows; i++) {
            for(int j = 0; j < numberOfColumns; j++) {
                a[i][j] = input.nextDouble();
            }
        }

        // Location 클래스를 이용해 만든 locateResult 인스턴스 생성
        Location locateResult = locateLargest(a);

        // 문제의 조건에 맞게 출력
        System.out.println("The location of the largest element is "
         + locateResult.maxValue + " at (" + locateResult.row + "," + locateResult.column + ")");
    }

    public static Location locateLargest(double[][] a) {
        Location locationInMethod = new Location();

        // locateLargest가 행, 열 수를 따로 전달받지 않음 - 배열의 크기로 행, 열 수 찾기
        int amountOfRow = a.length;
        int amountOfCol = a[0].length;

        // row, column, maxValue 찾기
        for(int i = 0; i < amountOfRow; i++) {
            for(int j = 0; j < amountOfCol; j++) {
                if(a[i][j] > locationInMethod.maxValue) {
                    locationInMethod.row = i;
                    locationInMethod.column = j;
                    locationInMethod.maxValue = a[i][j];
                }
            }
        }
        return locationInMethod;
    }
}
