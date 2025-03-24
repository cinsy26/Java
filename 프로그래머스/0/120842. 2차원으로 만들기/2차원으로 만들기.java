class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int m = 0;
            for(int i = 0; i<num_list.length/n;i++){
                for(int l = 0; l<n; l++){
                    
                    if(m>num_list.length){
                        m=0;
                        break;
                    }else{
                        answer[i][l]=num_list[m];
                    m++;
                    }
                    
                }
            }
        return answer;
    }
}