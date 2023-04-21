package lecture_230407;

public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    // 문자의 길이를 반환하여 출력
    public void length() {
        System.out.println("length() : " + this.chars.length);
    }

    // 특정 위치의 char를 반환하여 출력
    public void charAt(int index) {
        System.out.println("charAt() : " + this.chars[index]);
    }

    // 특정 위치의 글자를 반환하여 출력
    public void substring(int begin, int end) {
        System.out.print("substring() :");
        for(int i = begin; i < end; i++) {
            System.out.print(this.chars[i]);
        }
        //개행을 위한 출력
        System.out.println();
    }

    // 소문자로 변환하여 출력
    public void toLowerCase() {
        // 주어진 문자를 string으로 변환
        String str = new String(this.chars);

        // ref) https://www.javatpoint.com/how-to-convert-char-array-to-string-in-java
        System.out.print("toLowerCase() : " + str.toLowerCase());
    }
}
