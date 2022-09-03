import java.util.Scanner;
public class backjoon_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int pos=0;
        for (int i = 0; i <9 ; i++) {
            int j = sc.nextInt();
            if(max<j){
                max = j;
                pos = i+1;
            }
        }

        System.out.println(max);
        System.out.println(pos);
    }
}
