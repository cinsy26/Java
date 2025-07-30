import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        String[] str1 = br.readLine().split(" ");
        int[] array = new int[count];

        for (int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(str1[i]);
        }

        int big = array[0];  
        int small = array[0];

        for (int i = 1; i < count; i++) {
            if (array[i] > big) {
                big = array[i];
            }
            if (array[i] < small) {
                small = array[i];
            }
        }

        System.out.println(small + " " + big);
    }
}
