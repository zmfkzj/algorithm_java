import java.math.BigInteger;
import java.util.*;
public class backjoon_1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputCount = sc.nextInt();
        int[] results = new int[inputCount];
        for (int i=0;i< inputCount;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = 1;
            for (int j=0;j<b;j++){
                result = result*a % 10;
            }
            results[i] = result==0?10:result;
        }
        String[] r = Arrays.stream(results).mapToObj(String::valueOf).toArray(String[]::new);
        String answer = String.join("\n",r);

        System.out.println(answer);
    }
}
