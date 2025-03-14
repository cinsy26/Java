class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int hap = 0;
        boolean an = true;
        int len = numbers.length;
        for(int i = 0; i<len; i++){
            if(numbers[i]>=0&&numbers[i]<=1000){
                an = true;
            }else{
                an = false;
            }
        }
        if(len>=1 && len<=100 && an){
            for(int i = 0; i<len; i++){
                hap = hap + numbers[i];
            }
        }
        answer = (double) hap / len;
        return Math.round(answer * 10.0) / 10.0;
    }
}