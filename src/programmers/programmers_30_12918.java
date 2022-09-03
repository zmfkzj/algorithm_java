package programmers;

import java.time.*;
import java.util.List;

class programmers_30_12918 {
    public boolean solution(String s) {
        return s.chars().filter(x->'0'>x | x>'9').toArray().length==0 & List.of(4,6).contains(s.length());
    }



    public static void main(String[] args) {
        programmers_30_12918 inst = new programmers_30_12918();

        System.out.println(inst.solution("a123"));
        System.out.println(inst.solution("12345"));
    }
}