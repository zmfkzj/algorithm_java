package programmers;
import java.util.Arrays;

public class programmers_30_12935 {
    public int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int[] answer = Arrays.stream(arr).filter(x->x!=min).toArray();
        return answer.length==0?new int[]{-1}:answer;
    }

    public static void main(String[] args) {
        programmers_30_12935 inst = new programmers_30_12935();

        System.out.println(Arrays.toString(inst.solution(new int[]{4,3,2,1})));
        System.out.println(Arrays.toString(inst.solution(new int[]{10})));
    }
}
