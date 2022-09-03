import java.util.Scanner;
public class backjoon_9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String rank = new String();

        if (score>=90){
            rank = "A";
        } else if (score>=80) {
            rank = "B";
        } else if (score>=70) {
            rank = "C";
        } else if (score>=60) {
            rank = "D";
        }else{
            rank = "F";
        }
        System.out.println(rank);

    }
}
