import java.util.Arrays;
//import java.util.Scanner;
import java.io.*;
public class backjoon_10818 {
    public static void main(String[] args) {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
//        Scanner sc = new Scanner(System.in);
        try {
            sc.readLine();
            String a = sc.readLine();
            int[] b = Arrays.stream(a.trim().split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i : b) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }

            System.out.println(min + " " + max);
        }catch (Exception e){}
    }
}
