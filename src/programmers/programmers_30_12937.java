package programmers;


import java.util.HashMap;

public class programmers_30_12937 {
    public String solution(int num) {
        return num%2==0?"Even":"Odd";
    }

    public static void main(String[] args){
        programmers_30_12937 inst = new programmers_30_12937();
        System.out.println(inst.solution(3));
        System.out.println(inst.solution(4));

    }
}
