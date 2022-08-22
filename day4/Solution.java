package day4;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] answer = Solution.solution(arr);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<arr.length; i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }else if(stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }

        int N = stack.size();
        int[] answer = new int[N];

        for(int i=N-1; i>=0; i--){
            answer[i] = stack.pop();
        }

        return answer;
    }
}