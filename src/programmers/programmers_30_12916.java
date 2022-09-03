import java.util.Arrays.*;

class programmers_30_12916 {
    boolean solution(String s) {
        s = s.toLowerCase();
        int pCount = (int) s.chars().filter(x->x=='p').count();
        int yCount = (int) s.chars().filter(x->x=='y').count();

        return pCount==yCount;
    }

    public static void main(String[] args) {
        programmers_30_12916 inst = new programmers_30_12916();

        System.out.println(inst.solution("pPoooyY"));
        System.out.println(inst.solution("Pyy"));
    }
}