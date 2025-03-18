class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i = 0; i<s1.length; i++){
            for(int l = 0; l<s2.length; l++){
                if(s1[i].equals(s2[l])){
                    answer = answer + 1;
                }
            }
        }
        return answer;
    }
}