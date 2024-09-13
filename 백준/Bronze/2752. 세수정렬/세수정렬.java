import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		int C = Integer.parseInt(input[2]);
		
		int[] list = new int[] {A, B, C};
		
		Arrays.sort(list);
		
		System.out.println(list[0] + " " + list[1] + " " + list[2]);
		}
	}