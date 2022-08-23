package day4;

/**
 * 깊이/너비 우선탐색 : 타겟넘버
 */
public class Solution2 {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }

    public void dfs(int[] numbers, int depth, int target, int sum) {
        if (depth == numbers.length) {
            if (target == sum) {
                answer++;
            }
        } else {
            dfs(numbers, depth+1, target, sum + numbers[depth]);
            dfs(numbers, depth+1, target, sum - numbers[depth]);
        }
    }
}


