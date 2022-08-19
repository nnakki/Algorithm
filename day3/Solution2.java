package day3;

import java.util.HashMap;

/**
 * 2021 카카오 채용연계형 인턴쉽_숫자문자열과영단어
 */
public class Solution2 {

    public static void main(String[] args) {
        String s = "one4seveneight";
        int result = solution(s);
        System.out.println(result);
    }

    public static int solution(String s) {
        HashMap<String, Integer> dic = new HashMap<String, Integer>() {{
            put("zero", 0);
            put("one", 1);
            put("two", 2);
            put("three", 3);
            put("four", 4);
            put("five", 5);
            put("six", 6);
            put("seven", 7);
            put("eight", 8);
            put("nine", 9);
        }};

        StringBuilder str_answer = new StringBuilder();
        StringBuilder target = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                str_answer.append(s.charAt(i));
            } else {
                target.append(s.charAt(i));
                if (dic.containsKey(String.valueOf(target))) {
                    str_answer.append(dic.get(String.valueOf(target)));
                    target.setLength(0);
                }
            }
        }

        int answer = Integer.parseInt(String.valueOf(str_answer));

        return answer;
    }
}
