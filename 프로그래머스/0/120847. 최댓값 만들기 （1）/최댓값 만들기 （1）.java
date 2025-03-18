import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int num = numbers.length;
        Arrays.sort(numbers);
        answer = numbers[num-1]*numbers[num-2];
        return answer;
    }
}