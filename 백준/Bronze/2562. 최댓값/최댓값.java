import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[9];
        
        int big = 0;
        int count = 0;
        
        for(int i = 0; i<9 ; i++){
            array[i] = Integer.parseInt(br.readLine());
            if(array[i]>big){
                big = array[i];
                count = i+1;
            }
        }
        
        System.out.println(big);
        System.out.println(count);
    }
}