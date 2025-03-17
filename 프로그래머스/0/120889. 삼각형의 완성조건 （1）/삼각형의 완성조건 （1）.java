class Solution {
    public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];
        int answer = 0;
        if(a>b&&a>c){ //a가 제일 클 때
            if(a<b+c){
                answer=1;
            }else{
                answer=2;
            }
        }else if(b>a&&b>c){
            if(b<a+c){
                answer=1;
            }else{
                answer=2;
            }
        }else{
            if(c<a+b){
                answer=1;
            }else{
                answer=2;
            }
        }
        return answer;
    }
}