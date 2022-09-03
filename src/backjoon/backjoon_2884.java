import java.util.Scanner;
public class backjoon_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        int newHour;
        int newMinute;
        newMinute = (minute-45)<0?(15+minute):(minute-45);
        newHour = (minute-45)<0?((hour-1)<0?23:(hour-1)):hour;

        System.out.println(String.format("%d %d", newHour, newMinute));

    }
}
