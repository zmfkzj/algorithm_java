
public class programmers_30_12943 {
    public int solution(long num) {
        int answer = -1;
        for (int i = 0; i < 500; i++) {
            if(num==1){
                answer=i;
                break;
            }else{
                num = num%2==0?num/2:num*3+1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        programmers_30_12943 inst = new programmers_30_12943();

        System.out.println(inst.solution(6));
        System.out.println(inst.solution(16));
        System.out.println(inst.solution(626331));
    }
}
