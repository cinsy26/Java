import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNumber = 1;  // 테스트 케이스 번호

        while (true) {
            int n0 = sc.nextInt();  // 입력을 받음

            if (n0 == 0) {
                break;  // 입력이 0이면 프로그램 종료
            }

            // n1 계산
            int n1 = n0 * 3;
            String result = (n1 % 2 == 0) ? "even" : "odd";

            // n2, n3, n4 계산
            int n2 = (n1 % 2 == 0) ? (n1 / 2) : ((n1 + 1) / 2);
            int n3 = 3 * n2;
            int n4 = n3 / 9;

            // 출력 형식에 맞춰 결과 출력
            System.out.println(caseNumber + ". " + result + " " + n4);
            caseNumber++;  // 테스트 케이스 번호 증가
        }
    }
}
