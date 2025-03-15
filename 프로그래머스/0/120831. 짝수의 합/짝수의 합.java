class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%2==0){ //n은 짝수
            for(int a = n; a>=0; a-=2){
                answer = answer + a;
            }
        }else{//n은 홀수
            for(int a = n-1; a>=0; a-=2){
                answer = answer + a;
            }
            
        }
        return answer;
    }
}