package lecture_230324;

public class Problem_2 {
    public static void main(String[] args) {
        // 주어진 배열
        String[] words = { "write", "program", "that", 
        "receive", "positive" };

        // 주어진 단어 배열로 생성
        HangMan myNewGame = new HangMan(words);

        do {
            if(!myNewGame.isInit)
                myNewGame.initGame();
            myNewGame.askQuestion();
            myNewGame.checkLetter();
            if(myNewGame.correctGuess()) {
                myNewGame.printResult();
                myNewGame.askAnotherGame();
            }
        } while(!myNewGame.isFinished());   // 끝나기 전까지 반복
    }
}