class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int f = n / 10;
        answer = (n*12000) + (k-f)*2000;
        return answer;
    }
}