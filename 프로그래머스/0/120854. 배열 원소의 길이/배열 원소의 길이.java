class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i<strlist.length;i++){
            char[] arr = strlist[i].toCharArray();
            answer[i] = arr.length;
        }
        return answer;
    }
}