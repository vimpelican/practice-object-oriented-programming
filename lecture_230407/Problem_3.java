package lecture_230407;

/*
import java.util.List;
import java.util.ArrayList;
*/

public class Problem_3 {
    public static void main(String[] args) {
        // regex : regular expression, ref)https://en.wikipedia.org/wiki/Regular_expression
        String[] tokens = split("a?b?gf#e", "[?#]");

        for(int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
            
    }

    /*
    public static String[] split(String input, String regex) {
        List<String> tokens = new ArrayList<String>();
        int start = 0;
        int end = input.indexOf(regex);
        while (end >= 0) {
            String token = input.substring(start, end);
            tokens.add(token);
            start = end + regex.length();
            end = input.indexOf(regex, start);
        }
        String token = input.substring(start);
        tokens.add(token);
        return tokens.toArray(new String[tokens.size()]);
    }
    */

    public static String[] split(String s, String regex) {
        // 쪼갠 문자열을 저장할 String 배열
        String[] result = new String[s.length()];
        // substring을 저장할 string
        StringBuilder temp = new StringBuilder();
        
        int resultIndex = 0;

        for(int i = 0; i < s.length(); i++) {
            // regex가 아닌 경우(== 문자인 경우)
            if(!isRegex(s.charAt(i), regex)) {
                temp.append(s.charAt(i));
                result[resultIndex] = temp.toString();
            }

            // regex를 발견한 경우
            else {
                // 문자열 다음 인덱스에 regex를 대입한다
                result[++resultIndex] = s.charAt(i) + "";
                resultIndex++;

                // temp를 초기화한다
                temp.delete(0, temp.length());
            }
        }
        return result;
    }

    public static boolean isRegex(char ch, String regex) {
        for(int i = 0; i < regex.length(); i++) {
            if(ch == regex.charAt(i))
                return true;
        }
        return false;
    }
}
