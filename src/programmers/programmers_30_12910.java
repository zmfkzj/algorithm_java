package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class programmers_30_12910 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i:arr){
            if(i%divisor==0){
                result.add(i);
            }
        }
        int[] answer = {-1};
        if (result.isEmpty()){
            return  answer;
        }else{
            return result.stream().sorted().mapToInt(x->x).toArray();
        }
    }

    public static void main(String[] args) {
        programmers_30_12910 inst = new programmers_30_12910();

        System.out.println(Arrays.toString(inst.solution(new int[]{5,9,7,10}, 5)));
        System.out.println(Arrays.toString(inst.solution(new int[]{2,36,1,3}, 1)));
        System.out.println(Arrays.toString(inst.solution(new int[]{3,2,6}, 10)));
    }
}