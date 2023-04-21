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
        // 쪼갠 문자열을 저장할 임시 String 배열
        String[] result = new String[s.length()];
        int resultIndex = 0;
        int lastRegexIndex = -1;

        for(int i = 0; i < s.length(); i++) {
            // regex를 발견한 경우
            if(isRegex(s.charAt(i), regex)) {
                // 발견한 regex 전까지의 문자열을 substring으로 전환하여 할당
                result[resultIndex] = s.substring(lastRegexIndex + 1, i);
                // 다음 인덱스로 넘어감
                resultIndex++;
                // regex를 저장
                result[resultIndex] = s.charAt(i) + "";
                // 다음 인덱스로 넘어감
                resultIndex++;
                // 다음 substring을 계산하기 위해 이전에 나왔던 regex의 인덱스 기억
                lastRegexIndex = i;
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
