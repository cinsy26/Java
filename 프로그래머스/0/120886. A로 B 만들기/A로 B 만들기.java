import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] barr = before.split("");
        String[] aarr = after.split("");
        Arrays.sort(barr);
        Arrays.sort(aarr);
        if (Arrays.equals(barr, aarr)) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}