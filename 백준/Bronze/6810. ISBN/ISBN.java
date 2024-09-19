import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int Num = 91 + A*1 + B*3 + C*1;
		System.out.println("The 1-3-sum is " + Num);
	}
}