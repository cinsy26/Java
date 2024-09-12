import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = N; i >= 1; i--) {
				//BufferedWriter는 기본적으로 한 라인에 전부 출력해주기 때문에 줄바꿈 해줘야 함
				bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
	}
}
			