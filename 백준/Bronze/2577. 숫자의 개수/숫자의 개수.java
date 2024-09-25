import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        
        int Num = A * B * C;
        int[] s = new int[10]; // 수정된 부분
        String numStr = Integer.toString(Num); // Num을 문자열로 변환
        
        for (int i = 0; i < numStr.length(); i++) {
            char c = numStr.charAt(i);
            s[c - '0']++; // 문자 '0'의 아스키 코드 값을 사용하여 배열 인덱스 계산
        }
        
        for (int i = 0; i < s.length; i++) { // s.length를 사용
            System.out.println(s[i]);
        }
    }
}
