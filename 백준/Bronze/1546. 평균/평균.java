import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(br.readLine());
        double[] score = new double[count];
        double big = 0;
        
        String[] str1 = new String[count];
        str1 = br.readLine().split(" ");
        
        for(int i= 0; i<count; i++){
            score[i] = Double.parseDouble(str1[i]);
            if(score[i]>big){
                big = score[i];
            }
        }
        
        for(int i= 0; i<count; i++){
            score[i] = score[i]/big*100;
        }
        
        double answer = 0;
        double sum = 0;
        for(int i= 0; i<count; i++){
            sum = sum + score[i];
        }
        
        answer = sum/count;
        System.out.println(answer);
    }
}