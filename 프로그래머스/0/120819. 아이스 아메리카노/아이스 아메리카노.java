class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int am = money/5500;
        int left = money%5500;
        answer[0]=am;
        answer[1]=left;
        return answer;
    }
}