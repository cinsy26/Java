import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        
        // 5번 반복하면서 점수를 입력받고 합산
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            sum += a;
        }
        
        System.out.println(sum);
    }
}
