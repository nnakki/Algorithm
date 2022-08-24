package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 배열과 리스트
 * 숫자의 합 구하기
 */
public class boj11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int answer = 0;

        for(int i=0; i<n; i++){
            answer += Character.getNumericValue(s.charAt(i));
        }
        System.out.println(answer);
    }
}
