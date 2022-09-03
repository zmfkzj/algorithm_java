import java.io.*;
import java.util.Arrays;

public class backjoon_1546 {
    public static void main(String[] args) throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        sc.readLine();
        int[] input = Arrays.stream(sc.readLine().split(" ")).mapToInt(x->Integer.parseInt(x)).toArray();
        double max = Arrays.stream(input).max().getAsInt();
        double answer = Arrays.stream(input).mapToDouble(x->x/max*100).average().getAsDouble();

        System.out.println(answer);
    }
}
