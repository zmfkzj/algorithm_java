package programmers;
import java.util.Arrays;

class programmers_30_12930 {
    public String solution(String s) {
        String[] lowcaseArray = Arrays.stream(s.toLowerCase().split(" ",-1)).map(x-> {
            char[] w = x.toCharArray();
            for (int i=0;i<w.length;i++){
                if(i%2==0){
                    w[i] = String.valueOf(w[i]).toUpperCase().toCharArray()[0];
                }
            }
            return String.copyValueOf(w);
        }).toArray(String[]::new);
        String answer = String.join(" ",lowcaseArray);
        return answer;
    }

    public static void main(String[] args) {
        programmers_30_12930 inst = new programmers_30_12930();

        System.out.println(inst.solution("tRy i, ,hello world"));
        System.out.println(inst.solution(" 123 qweralkmvasdkfj   "));
    }
}