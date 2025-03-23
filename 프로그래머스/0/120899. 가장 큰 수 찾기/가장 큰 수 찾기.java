import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int num = 0;
        int[] answer = new int[2];
        int indexx = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i]> num){
                num = array[i];
                indexx = i;
            }
        }
        answer[0] = num;
        answer[1] = indexx;
        return answer;
    }
}