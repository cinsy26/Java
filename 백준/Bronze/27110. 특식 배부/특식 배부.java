import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		
		if(A>n){
			A = n;
		}else{
			A = A;
		};
		if(B>n){
			B = n;
		}else{
			B = B;
		};
		if(C>n){
			C = n;
		}else{
			C = C;
		};
		
		System.out.println(A+B+C);
	}
}