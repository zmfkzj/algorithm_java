import java.io.*;
import java.util.HashSet;
public class backjoon_3052 {
    public static void main(String[] args) throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet();
        for (int i = 0; i < 10; i++) {
            int input = Integer.parseInt(sc.readLine());
            set.add(input%42);
        }

        System.out.println(set.toArray().length);
    }
}
