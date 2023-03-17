package lecture_230317;

public class Problem_3 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.print("Enter a character: ");
        /*
        char를 입력받는 방법
        ref) https://stackoverflow.com/questions/13942701/take-a-char-input-from-the-scanner
        */
        char ch = input.next().charAt(0);

        int count = count(s, ch);
        // "The number of occurrences of e"로 실수할 뻔 함. Sampel run 말고 다른 것도 꼭 확인하기
        System.out.println("The number of occurrences of " + ch + " in " + s + " is " + count);
    }

    public static int count(String str, char ch) {
        int count = 0;
        /*
        str의 길이 == str의 마지막 index+1
        길이보다 작을 때 == 마지막 인덱스까지 반복
        */
        for(int index = 0; index < str.length() ; index++) {
            //글자 하나씩 확인하며, 찾는 글자와 같다면
            if(str.charAt(index) == ch)
                //카운트를 증가
                count++;
        }
        return count;
    }
}
