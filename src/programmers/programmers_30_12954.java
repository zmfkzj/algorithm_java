import java.util.Arrays;

class programmers_30_12954 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i+1);
        }
        return answer;
    }


    public static void main(String[] args) {
        programmers_30_12954 inst = new programmers_30_12954();

        System.out.println(Arrays.toString(inst.solution(2, 5)));
        System.out.println(Arrays.toString(inst.solution(4, 3)));
        System.out.println(Arrays.toString(inst.solution(-4, 2)));
        System.out.println(Arrays.toString(inst.solution(0, 2)));
        System.out.println(Arrays.toString(inst.solution(8, 1)));
    }
}