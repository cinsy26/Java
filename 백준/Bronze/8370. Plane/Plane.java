import java.util.Scanner;

public class Main{ //public을 까먹음
	public static void main(String[] args){ //얘도 public을 까먹음
	Scanner sc = new Scanner(System.in); //new Scanner(System.in);안씀
	
	int n1 = sc.nextInt(); //sc.nextInt();다
	int k1 = sc.nextInt();
	int n2 = sc.nextInt();
	int k2 = sc.nextInt();
	System.out.println(n1*k1 + n2*k2);
	}
}