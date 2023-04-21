import java.util.Scanner;
import java.util.Random;

public class Problem3 {
  public static void main(String[] args) {
    GuessNumberGame gNC = new GuessNumberGame();

    gNC.setTargetNumber();

    // generate the random number and invite user to guess it
    gNC.displayPleaseGuessMessage();

    // continue until the user guesses the number
    while (gNC.guessNumber != gNC.targetNumber) {
      // get a valid int from user
      gNC.guessNumber = gNC.getIntWithinRange();

      // display result of guess to user
      if (gNC.checkCorrect()) {
        gNC.displayCorrectGuessMessage();
      } else {
        gNC.displayHint();
      }

      // check Counter value
      if (!gNC.checkCounter()) {
        gNC.displayOutMessage();
        break;
      }

      gNC.counter++;
    }
  }
}

class GuessNumberGame {

  // #1. 객체에 필요한 속성값(field) 설정
  private int MIN;
  private int MAX;

  public int counter;
  private int COUNTER_LIMIT = 10;

  // 제시하는 숫자
  public int guessNumber;
  // 정답
  public int targetNumber;


  // #2 Constructor 완성 : 기본 숫자 범위
  GuessNumberGame() {
    this.MIN = 0;
    this.MAX = 50;
    this.counter = 0;
    setTargetNumber();
  }

  // #2 Constructor 완성 : 원하는 범위 지정 가능
  GuessNumberGame(int min, int max) {
    this.MIN = min;
    this.MAX = max;
    this.counter = 0;
    setTargetNumber();
  }

  // #3 맞춰야 하는 숫자 지정하는 메서드, 범위 내에서 랜덤으로 숫자 받아와 할당
  public void setTargetNumber() {
    this.targetNumber = getRandomNumber();
  }

  // 0~50의 랜덤 값 할당
  public int getRandomNumber() {
    Random rand = new Random();
    int randInt = rand.nextInt(51);
    return randInt;
  }

  // #4 guessNumber에 값을 지정할 수 있는 메서드, 지정 범위 벗어날 시 재입력
  public int getIntWithinRange() {
    Scanner input = new Scanner(System.in);
    guessNumber = input.nextInt();

    while(guessNumber > this.MAX || guessNumber < this.MIN) {
      System.out.println("Please enter again");
      guessNumber = input.nextInt();
    }

    return guessNumber;
  }

  public boolean checkCounter() {
    return this.counter < this.COUNTER_LIMIT;
  }

  public boolean checkCorrect() {
    return (this.targetNumber == this.guessNumber);
  }

  public void displayPleaseGuessMessage() {
    System.out.println("I'm thinking of a number from " + this.MIN +" to " + this.MAX + ".");
    System.out.println("Try to guess it.");
    System.out.println();
  }

  public void displayCorrectGuessMessage() {
    System.out.println("BINGO! The answer was " + this.targetNumber);
  }

  public void displayOutMessage() {
    System.out.println("Game Over !! You failed more than " + this.counter + " times.");
  }

  public void displayHint() {
    if (this.guessNumber > this.targetNumber)
      System.out.println("DOWN");
    else
      System.out.println("UP");
  }
}
