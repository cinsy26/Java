import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int m = array.length/2;
        int answer = array[m];
        return answer;
    }
}