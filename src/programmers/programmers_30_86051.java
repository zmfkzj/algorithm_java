package programmers;
import java.util.HashSet;
import java.util.Arrays;

public class programmers_30_86051 {
    public int solution(int[] numbers){
        HashSet<Integer> base = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        HashSet<Integer> input = new HashSet<Integer>();
        for(int n:numbers){
            input.add(n);
        }
        base.removeAll(input);
        Integer answer = Arrays.stream(base.toArray()).reduce(0,(a, b)->a+(Integer) b, (a,b)->a+b);

        return answer;
    }

    public static void main(String[] args){
        programmers_30_86051 inst = new programmers_30_86051();
        System.out.println(inst.solution(new int[]{1,2,3,4,5}));

    }
}
