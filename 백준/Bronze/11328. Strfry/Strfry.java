import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());  // 입력된 테스트 케이스 수를 정수로 변환

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String A = st.nextToken();
            String B = st.nextToken();

            int[] C = new int[26];  // 첫 번째 문자열의 알파벳 빈도 배열
            int[] D = new int[26];  // 두 번째 문자열의 알파벳 빈도 배열

            // 첫 번째 문자열의 알파벳 빈도 계산
            for (int j = 0; j < A.length(); j++) {
                C[A.charAt(j) - 'a']++;
            }
            // 두 번째 문자열의 알파벳 빈도 계산
            for (int j = 0; j < B.length(); j++) {
                D[B.charAt(j) - 'a']++;
            }

            boolean isPossible = true;  // 가능 여부를 판단할 플래그

            // 두 문자열의 알파벳 빈도가 일치하는지 확인
            for (int j = 0; j < 26; j++) {
                if (C[j] != D[j]) {
                    isPossible = false;
                    break;  // 차이가 발견되면 더 이상 비교하지 않고 종료
                }
            }

            // 결과 출력
            if (isPossible) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }
}
