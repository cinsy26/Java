import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

				int N = Integer.parseInt(st.nextToken()); // 학생 수
        int K = Integer.parseInt(st.nextToken()); // 최대 인원 수        
				int[] girl = new int[6];
        int[] boy = new int[6];
        
        int room = 0;

        for(int i = 0; i < N; i++){
						st = new StringTokenizer(br.readLine());
						int A = Integer.parseInt(st.nextToken()); // 성별
            int B = Integer.parseInt(st.nextToken()); // 학년            
						if(A==0){
                girl[B-1] += 1;
            }else{
                boy[B-1] += 1;
            }
        }
        
        for(int i = 0; i < girl.length; i++){
            if(girl[i]%K == 0){ //나머지가 없다
                room = room + girl[i]/K;
            }else{//나머지가 있다
                room = room + girl[i]/K + 1;
            }
        }
        
        for(int i = 0; i < boy.length; i++){
            if(boy[i]%K == 0){ //나머지가 없다
                room = room + boy[i]/K;
            }else{//나머지가 있다
                room = room + boy[i]/K + 1;
            }
        }
        System.out.println(room);
    }
}