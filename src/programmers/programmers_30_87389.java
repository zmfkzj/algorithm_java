package programmers;


public class programmers_30_87389 {
    public int solution(int n) {
        int i;
        for (i = 1; i < n; i++) {
            if(n%i==1){
                break;
            }
        }
        return i;
    }


    public static void main(String[] args){
        programmers_30_87389 inst = new programmers_30_87389();
        System.out.println(inst.solution(10));
        System.out.println(inst.solution(12));

    }
}
