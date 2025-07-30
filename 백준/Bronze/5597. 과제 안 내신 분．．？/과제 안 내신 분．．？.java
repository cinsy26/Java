import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] array = new int[30];
        int[] answer = new int[2];
        for(int i = 0; i<30; i++){
            array[i] = 0;
        }
        
        for(int i = 0; i<28; i++){
            int num = Integer.parseInt(br.readLine());
            array[num-1] = num;
        }
        
        for(int i = 0; i<30; i++){
            if(array[i]==0){
                if(answer[0]==0){
                    answer[0] = i+1;
                }else{
                    answer[1] = i+1;
                }
            }
        }
        
        int a = answer[0];
        int b = answer[1];
        
        if(a>b){
            System.out.println(b);
            System.out.println(a);
        }else{
            System.out.println(a);
            System.out.println(b);

        }
    }
}