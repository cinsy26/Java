class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0};
        
        int len = num_list.length;
        for(int i = 0; i<len; i++){
            if(num_list[i]%2==0){
                answer[0] = answer[0]+1;
            }else{
                answer[1] = answer[1]+1;
            }
        }
        return answer;
    }
}