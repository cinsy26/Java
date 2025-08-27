import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] S = br.readLine().split("");
        
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j","k", "l", "m", "n", "o", "p", "q", "r", "s", "t","u", "v", "w", "x", "y", "z"};
        int [] answer = new int[26];
        
        for(int i = 0; i<26; i++){
            for(int j = 0; j<S.length; j++){
                if(S[j].equals(alphabet[i])){
                    answer[i] = answer[i] +1;
                }
            }
        }
        
        for(int l = 0; l<26; l++){
            System.out.print(answer[l]+" ");
        }
    } 
}