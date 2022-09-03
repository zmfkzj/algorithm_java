package programmers;
import java.util.Scanner;
class programmers_30_12948 {
    public String solution(String phone_number) {
        int l = phone_number.length();
        String private_number = phone_number.substring(0,l-4);
        String public_number = phone_number.substring(l-4,l);
        private_number = private_number.replaceAll("\\d","*");
        String answer = private_number+public_number;
        return answer;
    }

    public static void main(String[] args) {
        programmers_30_12948 inst = new programmers_30_12948();

        System.out.println(inst.solution("01043555993"));
        System.out.println(inst.solution("021234567"));
    }
}