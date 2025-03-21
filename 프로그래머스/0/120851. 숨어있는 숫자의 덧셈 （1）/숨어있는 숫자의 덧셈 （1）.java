class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-Z]","");
        String[] arr = my_string.split("");

        int[] answer = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
        	answer[i] = Integer.parseInt(arr[i]);
		}
        int a = 0;
        for( int i = 0; i<arr.length; i++){
            a = a+answer[i];
        } 
        return a;
    }
}