package lecture_230331;

import java.util.Random;

public class Rand50Int {
    // 주어진 시드를 가진 random 객체
    private Random random = new Random(1000);

    // 랜덤으로 생성된 정수를 보관하는 배열
    private int[] randIntArray = new int[50];

    // 배열에 1000 시드를 가진 100개의 정수 설정
    public void createRandInt() {
        for(int i = 0; i < 50; i++) {
            randIntArray[i] = random.nextInt(100);
        }
    }

    // 출력 형식에 맟게 출력
    public void displayRandInt() {
        for(int i = 0; i < 50; i++) {
            // 10개씩 끊어서 출력하기 위한 if문
            if(i % 10 == 0)
                System.out.println();
            System.out.print(randIntArray[i] + " ");
        }
    }
}