package programmers;
import java.util.Arrays;
import java.util.Vector;

class programmers_30_12932 {
    public int[] solution(long n) {
        Vector<Integer> answer = new Vector();
        String.valueOf(n).chars().map(x->x-'0').forEach(x->answer.add(0,x));
        return answer.stream().mapToInt(x-> x).toArray();
    }


    public static void main(String[] args) {
        programmers_30_12932 inst = new programmers_30_12932();

        System.out.println(Arrays.toString(inst.solution(12345)));
    }
}