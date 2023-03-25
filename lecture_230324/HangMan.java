package lecture_230324;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HangMan {
    // 주어진 단어를 저장하는 변수 - 게임 재시작 시 추가 할당 없이 재사용 가능
    String[] words;

    // 주어진 단어 중 무작위로 한 String을 받는 변수
    String answerString;

    /* 특정 위치의 문자 조작을 위한 두 char형 배열
     * answerChar - 정답 단어를 복사 / question - 정답 단어을 복사한 뒤 *로 암호화
     */ 
    char[] answerChar;
    char[] question;

    // 입력을 받기 위한 변수
    Scanner input = new Scanner(System.in);
    char letter;

    // 매번 게임 초기화를 하기 위한 플래그
    boolean isInit;
    
    // 각 입력에 정답을 맞췄는지 확인하는 플래그
    boolean isMatched;

    // 틀린 횟수를 카운트하는 변수
    int missedTimes;

    // 게임 재시작 확인 변수
    String anotherGame;

    public HangMan(String[] givenStringArr) {
        words = givenStringArr;

        // 최초 초기화를 위해 isInit을 false로 설정
        isInit = false;
    }
    public void initGame() {
        // 0~4의 랜덤한 정수 생성 후 해당 인덱스의 String을 할당
        Random rand = new Random();
        answerString = words[rand.nextInt(5)];
        
        // 특정 인덱스의 문자 조작(*<->정답 문자)을 위해 char형 배열로 변환
        answerChar = answerString.toCharArray();

        // 정답 단어를 *로 가린 question 배열 생성
        question = new char[answerChar.length];
        for(int i = 0; i<answerChar.length; i++)
            question[i] = '*';

        // 다시 초기화하지 않기 위해 플래그 갱신
        isInit = true;

        // 계산에 필요한 변수 초기화
        missedTimes = 0;
    }
    public void askQuestion() {    
        // 질문 출력
        System.out.print("(Guess) Enter a letter in word ");
        for(int i = 0; i < question.length; i++)
            System.out.print(question[i]);
        System.out.print(" >");
        letter = input.next().charAt(0);
    }
    public void checkLetter() {
        // 매 입력마다 새로 확인해야 하므로 플래그 초기화
        isMatched = false;

        for(int i = 0; i < question.length; i++) {
            if(answerChar[i] == letter) {
                // 입력한 글자가 정답에 포함된다면 해당 위치의 *을 정답 글자로 변경
                question[i] = letter;
                isMatched = true;
            }
        }
        // 플래그가 false라면 바꾸는 데 실패한 것(오답)이므로 실패한 횟수 증가
        if(!isMatched) {
            System.out.println(letter + " is not in the word");
            missedTimes++;
        }
    }
    public boolean correctGuess() {
        // 두 배열이 같다면(*가 없다면) 모든 글자를 맞춘 것
        if(Arrays.equals(question, answerChar))
            return true;
        else
            return false;
    }
    public void printResult() {
        // 결과 출력
        System.out.print("The word is ");
        for(int i = 0; i < question.length ; i++)
            System.out.print(question[i]);
        
        // 보다 나은 출력(0/1 times 대신 0/1 time)을 위해 조건 추가
        if(missedTimes == 1 || missedTimes == 0)
            System.out.println(". You missed " + missedTimes + " time.");
        else
            System.out.println(". You missed " + missedTimes + " times.");
    }
    public void askAnotherGame() {
        // 유저에게 재시작 질문
        System.out.print("Do you want to guess for another word? Enter y or n>");
        
        // 재시작 여부를 입력
        Scanner input = new Scanner(System.in);
        char isEnd = input.next().charAt(0);
        
        // 다시 하고싶다면 게임 초기화를 위해 isInit를 false로 변경
        if(isEnd == 'y')
            isInit = false;
        // 끝내고 싶다면 주어진 변수(anotherGame)을 특정 String으로 설정
        else if(isEnd == 'n')
            anotherGame = "Finish";
        }
    public boolean isFinished() {
        // anotherGame가 특정 조건(원하는 String)을 만족한다면 while문 종료
        if(anotherGame == "Finish")
            return true;
        else
            return false;
    }
}