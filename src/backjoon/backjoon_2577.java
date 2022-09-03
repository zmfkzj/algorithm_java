import java.util.Arrays;
import java.io.*;

public class backjoon_2577 {
    public static void main(String[] args) throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int prod = 1;
        for (int i = 0; i < 3; i++) {
            prod *= Integer.parseInt(sc.readLine());
        }
        char[] chProd = String.valueOf(prod).toCharArray();

        int[] output = new int[10];

        for (char c:chProd){
            output[c-'0']++;
        }
        for (int j:output){
            System.out.println(j);
        }
    }
}
