import java.util.*;
public class backjoon_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        List<Integer> numbers = Arrays.asList(a,b,c);
        Integer maxvalue = numbers.stream().mapToInt(x->x).max().getAsInt();
        int maxCount = 1;
        for (int i=0; i<3; i++){
            if (numbers.subList(i+1,3).contains(numbers.get(i))){
                maxvalue = numbers.get(i);
                maxCount++;
            }
        }
        backjoon_2480 inst = new backjoon_2480();
        int score = inst.getScore(maxvalue, maxCount);
        System.out.println(score);
    }

    public int getScore(Integer maxValue, int count){
        int score = 0;
        switch (count){
            case 3:
                score = 10000 + maxValue*1000;
                break;
            case 2:
                score = 1000 + maxValue*100;
                break;
            case 1:
                score = maxValue*100;
                break;
            default:
                System.err.println("count out of value");
        }
        return score;
    }
}
