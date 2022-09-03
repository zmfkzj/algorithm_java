import java.time.*;

class programmers_30_12901 {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016,a,b);
        int day = date.getDayOfWeek().getValue();
        String answer = new String();
        switch (day){
            case 1:
                answer = "MON";
                break;
            case 2:
                answer = "TUE";
                break;
            case 3:
                answer = "WED";
                break;
            case 4:
                answer = "THU";
                break;
            case 5:
                answer = "FRI";
                break;
            case 6:
                answer = "SAT";
                break;
            case 7:
                answer = "SUN";
                break;
        }
        return answer;
    }


    public static void main(String[] args) {
        programmers_30_12901 inst = new programmers_30_12901();

        System.out.println(inst.solution(2, 5));
        System.out.println(inst.solution(5, 24));
    }
}