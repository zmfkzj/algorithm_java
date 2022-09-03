package programmers;
import java.time.*;
import java.util.Arrays;

class programmers_30_12919 {
    public String solution(String[] seoul) {
        int position = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")){
                position = i;
                break;
            }
        }

        return String.format("김서방은 %d에 있다",position);
    }



    public static void main(String[] args) {
        programmers_30_12919 inst = new programmers_30_12919();

        System.out.println(inst.solution(new String[]{"Jane","Kim"}));
        System.out.println(inst.solution(new String[]{"Kim"}));
        System.out.println(inst.solution(new String[]{"Jane","Kim","Jane",}));
    }
}