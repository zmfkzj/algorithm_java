import java.util.Arrays;

class programmers_30_82612 {
    public long solution(int price, long money, int count) {
        long[] costN = new long[count];
        for (int i = 0; i <count; i++) {
            costN[i] = (long) price*(i+1);
        }
        long cost = Arrays.stream(costN).sum();
        long cha = money-cost;
        long answer = cha<0?-cha:0;
        return answer;
    }



    public static void main(String[] args) {
        programmers_30_82612 inst = new programmers_30_82612();

        System.out.println(inst.solution(3,20,4));
        System.out.println(inst.solution(1,1,4));
        System.out.println(inst.solution(3,10000000000L,4));
    }
}