package lecture_230324;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] counts = new int[50];

        System.out.print("Enter the integers between 1 and 50: ");
        
        int number = input.nextInt();

        // 숫자 입력
        while(number != 0) {
            counts[number-1]++;
            // 다음 입력을 받아 number 갱신
            number = input.nextInt();
        }

        // 출력
        for(int i=0; i<counts.length; i++) {
            if(counts[i] == 0)
                continue;
            else if(counts[i] == 1)
                // counts[0] ~ counts[49]가 0+1~49+1의 빈도를 의미
                // 올바른 출력을 위해 결과문에 i+1 사용해야 함
                System.out.println(i+1 + " occurs " + counts[i] + " time");
            else
                System.out.println(i+1 + " occurs " + counts[i] + " times");
        }
    }
}
