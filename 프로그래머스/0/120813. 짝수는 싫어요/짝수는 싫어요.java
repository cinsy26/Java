class Solution {
    public int[] solution(int n) {
        int len = 0;
        if(n%2==0){
            len=n/2;
        }else{
            len=n/2+1;
        }
        int[] answer = new int[len];
        int l = 0;
        for(int i = 1; i<=n;i = i+2){
            answer[l]=i;
            l++;
        }
        return answer;
    }
}