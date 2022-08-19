package day3;

import java.util.HashMap;

/**
 * 성격유형검사
 * survey : 질문마다 판단하는 지표를 담은 1차원 배열 ( 매개변수 )
 * choices : 검사자가 선택한 선택지를 담은 1차원 배열 ( 매개변수 )
 */
public class Solution {

    public static void main(String[] args) {
        String[] survey = {"TR", "RT", "TR"};
        int[] choices = {7, 1, 3};

        String answer = solution(survey, choices);
        System.out.println(answer);
    }

    public static String solution(String[] survey, int[] choices) {
        HashMap<Character, Integer> mbti = new HashMap<Character, Integer>() {{
            put('R', 0);
            put('T', 0);
            put('C', 0);
            put('F', 0);
            put('J', 0);
            put('M', 0);
            put('A', 0);
            put('N', 0);
        }};

        int COUNT = survey.length;

        for (int i = 0; i < COUNT; i++) {
            char type1 = survey[i].charAt(0);
            char type2 = survey[i].charAt(1);

            if (choices[i] > 4) {
                mbti.put(type2, mbti.get(type2) + (choices[i] - 4));
            } else if (choices[i] < 4) {
                mbti.put(type1, mbti.get(type1) + (4 - choices[i]));
            }
        }

        String answer = makeAnswer(mbti);

        return answer;
    }

    public static String makeAnswer(HashMap<Character, Integer> mbti){
        StringBuilder sb = new StringBuilder();

        if(mbti.get('R') >= mbti.get('T')){
            sb.append('R');
        }else{
            sb.append('T');
        }

        if(mbti.get('C') >= mbti.get('F')){
            sb.append('C');
        }else{
            sb.append('F');
        }

        if(mbti.get('J') >= mbti.get('M')){
            sb.append('J');
        }else{
            sb.append('M');
        }

        if(mbti.get('A') >= mbti.get('N')){
            sb.append('A');
        }else{
            sb.append('N');
        }

        return sb.toString();
    }
}