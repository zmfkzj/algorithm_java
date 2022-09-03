import java.util.Calendar;

public class SwitchExam {
    public static void main(String[] args) {
        // month에는 오늘이 몇 월인지 들어 있습니다.
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String season = "";
        // switch문을 이용해서 season이 오늘은 어떤 계절인지 나타내게 만들어보세요.
        switch (month){
            case 1,2,3:
                season = "겨울";
                break;
            case 4,5,6:
                season = "봄";
                break;
            case 7,8,9:
                season = "여름";
                break;
            case 10,11,12:
                season = "가을";
                break;
            default:
                break;
        }

        System.out.println("지금은 " + month + "월이고, " + season + "입니다.");
    }
}