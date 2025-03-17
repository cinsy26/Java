import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char arr[] = my_string.toCharArray();
        int len = arr.length;
        char aarr[] = new char[len];
        for(int i = 0; i<len; i++){
            aarr[len-1-i] = arr[i];
        }
        return new String(aarr);
    }
}