import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < 5; i++){
			int A = sc.nextInt();
			if(N==A){
				sum++;
			}
		}
		System.out.println(sum);
	}
};