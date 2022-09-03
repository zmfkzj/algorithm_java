import java.util.Arrays;
import java.util.List;

class programmers_30_70128 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer+=a[i]*b[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        programmers_30_70128 inst = new programmers_30_70128();

        System.out.println(inst.solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2}));
        System.out.println(inst.solution(new int[]{-1,0,1}, new int[]{1,0,-1}));
    }
}