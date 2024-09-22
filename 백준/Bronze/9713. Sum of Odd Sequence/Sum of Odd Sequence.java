import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		
		for(int i = 1; i<=Num; i++){
			int A = sc.nextInt();
			int B = 0;
			for(int j = 1; j <=A; j+=2){
				B = B + j;
			}
			System.out.println(B);

		}
	}
}