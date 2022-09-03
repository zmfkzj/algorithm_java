import java.io.*;
import java.util.Arrays;

public class backjoon_8958 {
    public static void main(String[] args) throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(sc.readLine());
        for (int i = 0; i < count; i++) {
            String input = sc.readLine();
            int Os = Arrays.stream(input.split("X")).filter(x-> x.length()!=0).mapToInt(x->x.length()*(1+x.length())/2).sum();
            System.out.println(Os);
        }

    }
}
