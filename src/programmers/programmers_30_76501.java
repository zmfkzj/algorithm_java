import java.util.Arrays;

public class programmers_30_76501 {
    public int solution(int[] absolutes, boolean[] signs){

        int sum = 0;
        for (int i = 0; i < absolutes.length; i++) {
            sum += absolutes[i] * (signs[i]?1:-1);
        }
        return sum;
    }

    public static void main(String[] args) {


    }

}
