package programmers;
public class programmers_30_12944 {
    public double solution(int[] arr) {
        int sum = 0;
        double count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count = i;
        }
        double answer = sum / (count+1);
        return answer;
    }

    public static void main(String[] args) {
        programmers_30_12944 inst = new programmers_30_12944();
        System.out.println(inst.solution(new int[]{1,2,3,4}));

    }
}
