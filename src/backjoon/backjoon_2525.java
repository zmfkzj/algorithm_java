import java.util.Scanner;
public class backjoon_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int time = sc.nextInt();


        int newHour = (hour+(minute+time)/60);
        newHour = newHour>23?newHour-24:newHour;
        int newMinute = (minute+time)%60;
        System.out.println(String.format("%d %d", newHour, newMinute));

    }
}
