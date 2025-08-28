import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int[] arr = new int[k];
        Stack<Integer> stack = new Stack<>();
        
        int answer = 0;
        
        for(int i = 0; i<k; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        
        for(int j = 0; j<k; j++){
            if(arr[j]==0){
                stack.pop();
            }else{
                stack.push(arr[j]);
            }
        }
        
        int len = stack.size();
        
        for (int h = 0; h < len; h++) {
        answer += stack.get(h);  // ← stack[len] 대신 get(h)
        }
        
        System.out.println(answer);
    }
}