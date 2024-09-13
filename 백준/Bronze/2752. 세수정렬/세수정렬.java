import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	int A = sc.nextInt();
	int B = sc.nextInt();
	int C = sc.nextInt();
	
	int[] list = new int [] {A, B, C};
	
	Arrays.sort(list);
	
  System.out.println(list[0] + " " + list[1] + " " + list[2]);
	}
}