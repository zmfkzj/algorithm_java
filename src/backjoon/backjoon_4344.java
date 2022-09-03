import java.io.*;
import java.util.Arrays;

public class backjoon_4344 {
    public static void main(String[] args) throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(sc.readLine());
        for (int i = 0; i < count; i++) {
            int[] input = Arrays.stream(sc.readLine().split(" ")).mapToInt(x->Integer.parseInt(x)).toArray();
            int[] subInput = Arrays.copyOfRange(input, 1,input.length);
            float avg = (float) Arrays.stream(subInput).average().getAsDouble();
            float rate = (float) Arrays.stream(subInput).mapToDouble(x->x>avg?100.:0.).average().getAsDouble();
            System.out.println(String.format("%.3f%%",rate));

        }

    }
}
