import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        int size = Integer.parseInt(str1);

        String str2 = br.readLine();
        String[] str2Array = str2.split(" "); // 문자열을 공백 기준으로 나눔
        int[] array = new int[size]; // 배열 선언 및 생성

        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(str2Array[i]); // 문자열을 int로 변환 후 배열에 저장
        }

        String str3 = br.readLine();
        int v = Integer.parseInt(str3);
        
        int answer = 0;
        
        for(int i = 0; i< size; i++){
            if(array[i]==v){
                answer = answer + 1;
            }
        }
        System.out.println(answer);
    }
}
