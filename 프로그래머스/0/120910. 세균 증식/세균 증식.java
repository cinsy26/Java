class Solution {
    public int solution(int n, int t) {
        int i = (int)Math.pow(2, t);
        int answer = n * i;
        return answer;
    }
}