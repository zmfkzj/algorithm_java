package programmers;
public class programmers_30_12947 {
    public boolean solution(int x) {
        int sum = 0;
        int y = x;
        while (y>=1){
            sum += y%10;
            y /=10;
        }
        return x%sum==0;
    }

    public static void main(String[] args) {
        programmers_30_12947 inst = new programmers_30_12947();

        System.out.println(inst.solution(10));
        System.out.println(inst.solution(12));
        System.out.println(inst.solution(11));
        System.out.println(inst.solution(13));
    }
}
