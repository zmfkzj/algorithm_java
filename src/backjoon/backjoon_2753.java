import java.util.Scanner;
public class backjoon_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        int isLeapYear = 0;
        if( year%4==0 & (year%100!=0 | year%400==0)){
            isLeapYear = 1;
        }
        System.out.println(isLeapYear);

    }
}
